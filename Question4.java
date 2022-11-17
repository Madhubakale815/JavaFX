package Aoop_Assign2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.BorderPane;
//import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
//import javafx.scene.control.Label;
//import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
//import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

public class Question4 extends Application {
	@Override
	public void start(Stage stage) {
		//Label for name
		BorderPane root = new BorderPane();
		stage.setTitle(" JavaFX Registration form");
		// label headerLabel = new Label("Registration Form");
		Label label = new Label("Employee Registration Form");
		// Object root;
		root.setTop(label);
		//root.setAlignment(label, Pos.CENTER);

		Text nameLabel = new Text("Enter your Name");

		//Text field for name
		TextField nameText = new TextField();

		//Label for date of birth

		Text dobLabel = new Text("Enter Date of birth");

		//date picker to choose date
		DatePicker datePicker = new DatePicker();

		//Label for gender
		Text genderLabel = new Text("Enter your Gender");

		//Toggle group of radio buttons
		ToggleGroup groupGender = new ToggleGroup();
		RadioButton maleRadio = new RadioButton("male");
		maleRadio.setToggleGroup(groupGender);
		RadioButton femaleRadio = new RadioButton("female");
		femaleRadio.setToggleGroup(groupGender);


		Text selectyourqualificationLabel = new Text("Select your qualification");

		//check box for education
		CheckBox ugCheckBox = new CheckBox("UG");
		ugCheckBox.setIndeterminate(false);

		//check box for education
		CheckBox pgCheckBox = new CheckBox("PG");
		pgCheckBox.setIndeterminate(false);
		CheckBox phdCheckBox = new CheckBox("PhD");
		phdCheckBox.setIndeterminate(false);


		//Label for location
		Text locationLabel = new Text("select your state");


		//Choice box for location
		ChoiceBox locationchoiceBox = new ChoiceBox();
		locationchoiceBox.getItems().addAll
		
		("Karnataka", "Tamilnadu", "Delhi", "Mumbai", "AP");

		Button buttonRegister = new Button("Register");

		//Creating a Grid Pane
		GridPane gridPane = new GridPane();

		//Setting size for the pane

		gridPane.setMinSize(500, 500);

		//Setting the padding
		gridPane.setPadding(new Insets(10, 10, 10, 10));

		//Setting the vertical and horizontal gaps between the columns
		gridPane.setVgap(5);
		gridPane.setHgap(5);

		//Setting the Grid alignment
		gridPane.setAlignment(Pos.CENTER);

		//Arranging all the nodes in the grid
		gridPane.add(nameLabel, 0, 0);
		gridPane.add(nameText, 1, 0);

		gridPane.add(dobLabel, 0, 3);
		gridPane.add(datePicker, 1, 3);

		gridPane.add(genderLabel, 0, 2);
		gridPane.add(maleRadio, 1, 2);
		gridPane.add(femaleRadio, 2, 2);
		// gridPane.add(reservationLabel, 0, 3);
		//gridPane.add(yes, 1, 3);

		gridPane.add(selectyourqualificationLabel , 0, 5);
		gridPane.add(ugCheckBox, 1, 5);
		gridPane.add(pgCheckBox, 2, 5);
		gridPane.add(phdCheckBox,3, 5);

		gridPane.add(locationLabel, 0, 4);
		gridPane.add(locationchoiceBox, 1, 4);


		gridPane.add(buttonRegister, 1, 8);

		//Styling nodes
		buttonRegister.setStyle(
				"-fx-font: normal bold 15px 'serif' " );

		nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
		dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
		genderLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

		selectyourqualificationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

		locationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");


		gridPane.setStyle("-fx-background-color: white;");

		buttonRegister.setOnAction(e->{
			// creating a dialog box
			Dialog dialog = new Dialog();
			dialog.setTitle("Registration Successfull");
			dialog.setHeaderText("Registration Status");
			dialog.setContentText("Employee Registration is successfull");

			// adding image to the dialog box
			// Image img = new Image("",50,50,true,true);
			//ImageView imageview = new ImageView(img);
			//
			//dialog.setGraphic(imageview);

			// adding button to the dialog box
			dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
			dialog.show();
		});


		Scene scene = new Scene(gridPane);


		// stage.setTitle("Registration Form");

		//Adding scene to the stage
		stage.setScene(scene);

		//Displaying the contents of the stage
		stage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}
