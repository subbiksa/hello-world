package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SelectProfile {
	
	public static void select(String title, String msg) {
		 Stage frame= new Stage();
         frame.initModality(Modality.APPLICATION_MODAL);
         frame.setTitle(title);
         frame.setWidth(300);
         Label l1= new Label(title);
         l1.setText(msg);
         ChoiceBox<String> choice = new ChoiceBox<>();
         choice.getItems().add("Profile1");
         choice.getItems().add("Profile2");
         choice.getItems().add("Profile3");   
         choice.getItems().add("Profile4");
         choice.setValue("Profile1");
         Button select=new Button("Select the Profile");
         select.setOnAction(e -> getChoice(choice));
         VBox layout= new VBox(30);
         layout.getChildren().addAll(l1,choice,select);
         layout.setAlignment(Pos.CENTER);
         Scene scene= new Scene(layout);
         frame.setScene(scene);
         frame.showAndWait();
        
	}

	private static void getChoice(ChoiceBox<String> choice) {
		String profile= choice.getValue();
		System.out.println(profile);
		try {
	    	// 1.connection  to database
	    	  Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
	    	// 2.creation of stats
	    	  Statement myst = mycon.createStatement(); 
	    	// 3. execution of sql 
	    	  ResultSet myres = myst.executeQuery("select * from profile where ID=1");
	    	// 4. Process the resultset  
	          while(myres.next()) {
	        	  System.out.println(myres.getString("name"));
	        	  System.out.println(myres.getString("age"));
	        	  System.out.println(myres.getString("job"));
	        	  System.out.println(myres.getString("image"));
	          }
	      }
	      catch(Exception e) {
	    	  e.printStackTrace();
	      }
		
	}
		
	}



