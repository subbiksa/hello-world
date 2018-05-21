package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Profile extends Application {
	public static void main(String args[]) {
		launch(args);
	}
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button viewbt = new Button("View People on Mininet");
		Button addbt = new Button ("Add profile in Mininet");
		viewbt.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("***List of people on Mininet***");
				try {
			    	// 1.connection  to database
			    	  Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
			    	// 2.creation of stats
			    	  Statement myst = mycon.createStatement(); 
			    	// 3. execution of sql 
			    	  ResultSet myres = myst.executeQuery("select * from profile");
			    	// 4. Process the resultset  
			          while(myres.next()) {
			        	  System.out.println(myres.getString("name"));
			        	  
			          }
			      }
			      catch(Exception e) {
			    	  e.printStackTrace();
			      }
				
			}
		});
		VBox root= new VBox();
		root.getChildren().addAll(viewbt,addbt);
		Scene scene = new Scene(root,500,500);
		primaryStage.setTitle("Mininet-Social Network");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	} 

}
