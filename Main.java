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
		Button addProfile= new Button("Add a new profile to Mininet!");
		addProfile.setOnAction(e -> {
			boolean answer = (boolean) AddPerson.close("Add a profile", "Are you sure to Add?");
			System.out.println(answer);
		});
		Button selectProfile = new Button("Select a profile");
		selectProfile.setOnAction(e->{
			SelectPerson.select("Make a selection of the Profile,", "Select a Person From Mininet");
		});
		Button view = new Button("Display a profile");
		view.setOnAction(e->{
			displayProfile.display("Display", "View the profiles on Mininet");
		});
		Button delete = new Button("Delete a profile");
		delete.setOnAction(e->{
			 deleteProfile.delete("Delete", "Deletion of profiles on Mininet");
		});
		
		Button exit = new Button("Close Application");
		exit.setOnAction(e -> ExitApp.close("Exit Mininet","Close and Exit Mininet"));
		// primary layout
		VBox primarylayout = new VBox(20);
		primarylayout.setAlignment(Pos.CENTER);
		primarylayout.getChildren().addAll(label1,addProfile,selectProfile,view,delete,exit);
		Profile = new Scene(primarylayout,500,500); 
		// Button
		Button view1= new Button("Add a new Profile to Mininet");
		StackPane layout2= new StackPane();	
		layout2.getChildren().add(view1);
		AddProfile= new Scene(layout2,600,300);
		frame.setScene(Profile);
		frame.setTitle("MININET");
		frame.show();
		}
	public static void main(String[] args) {
		launch(args);
	}
}
