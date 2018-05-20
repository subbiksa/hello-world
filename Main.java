package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
public class Main extends Application {
	Stage frame;
	Scene Profile,AddProfile;
	public void start(Stage primaryStage) {
		frame= primaryStage;
		//label1
		Label label1 = new Label("Welcome to MININET!");
		Button viewProfile= new Button("View the profiles on Mininet!");
		viewProfile.setOnAction(e -> frame.setScene(AddProfile));
		Button exit = new Button("Close Application");
		exit.setOnAction(e -> ExitApp.close("Exit Mininet","Close and Exit Mininet"));
		// primary layout
		VBox primarylayout = new VBox(20);
		primarylayout.setAlignment(Pos.CENTER);
		primarylayout.getChildren().addAll(label1,viewProfile,exit);
		Profile = new Scene(primarylayout,500,500); 
		// Button
		Button view= new Button("List of people on Mininet");
		view.setOnAction(e -> frame.setScene(AddProfile));
		StackPane layout2= new StackPane();	
		layout2.getChildren().add(view);
		AddProfile= new Scene(layout2,600,300);
		frame.setScene(Profile);
		frame.setTitle("MININET");
		frame.show();
		}
	public static void main(String[] args) {
		launch(args);
	}
}
