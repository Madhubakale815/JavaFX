package Aoop_Assign2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Question1 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) {
		// TODO Auto-generated method stub
		myStage.setTitle("UserName and PassWord");

		VBox vbox = new VBox();
		HBox hbox = new HBox();

		Label label = new Label("User Name : ");
		TextField tf = new TextField();

		// layout for component
		HBox hbox2 = new HBox();

		Label label2 = new Label(" password : ");
		PasswordField pass = new PasswordField();

		// to keep components center
		hbox.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);

		// adding components to the horizontal layout
		hbox.getChildren().addAll(label, tf);
		hbox2.getChildren().addAll(label2, pass);

		// creating the button
		Button btn = new Button("Submit");

		// label for show results
		Label label1 = new Label("");

		// assumed value for validation
		String username = "21CS403";
		String password = "Madhu";
		
		// setting action on button
		btn.setOnAction(e -> {
			// getting the values from the field
			String EUsername = tf.getText();
			String Epassword = pass.getText();

			// if entered username and password are equal then create a new welcomeScene
			if (username.equals(EUsername) && password.equals(Epassword)) {
				// label1.setText(" : WELCOME : ");
				FlowPane flowpane = new FlowPane();
				flowpane.setAlignment(Pos.CENTER);
				Label welcome = new Label(": Welcome :");
				flowpane.getChildren().add(welcome);
				Scene myScene1 = new Scene(flowpane, 500, 300);
				myStage.setScene(myScene1);
			} else {
				try {
					throw new MyException();
				} catch (MyException e1) {
					label1.setText(e1.toString());
				}
			}
		});

		// adding horizontal components to the main vertical layout
		vbox.getChildren().addAll(hbox, hbox2, btn, label1);

		// adding layout to the scene
		Scene myScene = new Scene(vbox, 500, 300);

		// sapcing between the vartical components
		vbox.setSpacing(10);
		vbox.setAlignment(Pos.CENTER);

		myStage.setScene(myScene);

		myStage.show();
	}
}

class MyException extends Exception {
	public String toString() {
		return "Invaid UserName and Password";
	}
}
