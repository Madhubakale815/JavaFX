package Aoop_Assign2;

import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Question3 extends Application {
	
	public void start(Stage stage) throws FileNotFoundException {
		
		// Creating the image view
		
		Button button1 = new Button("new");
		Button button2 = new Button("view");
	
		// Creating a context menu
		ContextMenu contextMenu1 = new ContextMenu();
		
		// Creating the menu Items for the context menu
		MenuItem item1 = new MenuItem("file");
		MenuItem item2 = new MenuItem("folder");
		MenuItem item3 = new MenuItem("image");
		contextMenu1.getItems().addAll(item1, item2, item3);
		
		// Adding the context menu to the button and the text field
		ContextMenu contextMenu2 = new ContextMenu();
		
		// Creating the menu Items for the context menu
		MenuItem item11 = new MenuItem("large");
		MenuItem item21 = new MenuItem("medium");
		MenuItem item31 = new MenuItem("small");
		contextMenu2.getItems().addAll(item11, item21, item31);

		// textField.setContextMenu(contextMenu);
		button1.setContextMenu(contextMenu1);
		button2.setContextMenu(contextMenu2);
		HBox layout = new HBox(20);
		layout.setPadding(new Insets(15, 15, 15, 100));
		layout.getChildren().addAll(button1, button2);
		
		// Setting the stage
		Scene scene = new Scene(new Group(layout), 595, 150, Color.BEIGE);
		stage.setTitle("CustomMenuItem");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}

