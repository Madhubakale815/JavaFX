package Aoop_Assign2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Question2 extends Application {
 public void start(Stage stage) {
 //Creating file menu
 Menu file = new Menu("File");
 //Creating file menu items
 MenuItem item1 = new MenuItem("New");
 MenuItem item2 = new MenuItem("Open");
 MenuItem item3 = new MenuItem("Save");
 //Adding all the menu items to the file menu
 file.getItems().addAll(item1, item2, item3);
 //Creating edit menu
 Menu edit = new Menu("Edit");
 //Creating fileList menu items
 MenuItem item6 = new MenuItem("Cut");
 MenuItem item7 = new MenuItem("Copy");
 MenuItem item8 = new MenuItem("Paste");
 //Adding all the items to File List menu
 edit.getItems().addAll(item6, item7, item8);
 //Creating help menu
 Menu help = new Menu("Help");
 MenuItem item9 = new MenuItem("Help center");
 MenuItem item10 = new MenuItem("About Us");
 help.getItems().addAll(item9, item10);
 //Creating a menu bar
 MenuBar menuBar = new MenuBar();

 menuBar.setTranslateX(200);
 menuBar.setTranslateY(20);
 //Adding all the menus to the menu bar
 menuBar.getMenus().addAll(file, edit, help);
 //Setting the stage
 Group root = new Group(menuBar);
 Scene scene = new Scene(root, 595, 200, Color.BEIGE);
 stage.setTitle("Menu Bar Example");
 stage.setScene(scene);
 stage.show();
 }
 public static void main(String args[]){
 launch(args);
 }
} 
