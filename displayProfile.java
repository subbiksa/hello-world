package application;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import com.mysql.jdbc.Statement;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class displayProfile{
	 static java.sql.Connection mycon=null;
	 static Statement myst=null;
     public static void display(String title, String msg) {
		// TODO Auto-generated method stub
		Stage frame= new Stage();
        frame.initModality(Modality.APPLICATION_MODAL);
        frame.setTitle(title);
        frame.setWidth(300);
        Label l1= new Label(title);
        ComboBox<String> choice = new ComboBox<>();
        choice.getItems().addAll(
				   "Profile1-Chandler Bing",
				   "Profile2-Joey Bing",
				   "Profile3-Phoebe Bing",
				   "Profile4-Rachel Geller",
				   "Profile5-Ross Geller",
				   "Profile6-Monica Geller",
				   "Profile7-Richa Rawat"
				    );
		   choice.setPromptText("Choose a profile!");
		choice.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue)->{
   	 System.out.println("User Selected : "+newValue) ;
   	 
    });
		   Button select=new Button("Display the selected Profile details!");
		   select.setOnAction(e ->{
			   Scanner in = new Scanner(System.in);
        	   System.out.println("Enter the profile name: ");
        	   String name =in.nextLine();
        	   String name1="Chandler Bing";
        	   String name2="Joey Bing";
        	   String name3="Phoebe Bing";
        	   String name4="Rachel Geller";
        	   String name5="Ross Geller";
        	   String name6="Monica Geller";
        	   String name7="Richa Rawat";
        	   if(name.equals(name1)) {
        	   try {
			    	// 1.connection  to database
			    	  java.sql.Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
			    	// 2.creation of stats
			    	  java.sql.Statement myst = mycon.createStatement(); 
			    	// 3. execution of sql 
			    	  ResultSet myres = myst.executeQuery("select * from profile where id = 1");
			    	// 4. Process the resultset  
			          while(myres.next()) {
			        	  System.out.println(myres.getString("name"));
			        	  System.out.println(myres.getString("age"));
			        	  System.out.println(myres.getString("job"));
			        	  System.out.println(myres.getString("image"));    
			          }
			      }
			      catch(Exception e1) {
			    	  e1.printStackTrace();
			      }
        	   frame.close();
        	   in.close();
        	   }
        	   if(name.equals(name2)) {
            	   try {
    			    	// 1.connection  to database
    			    	  java.sql.Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
    			    	// 2.creation of stats
    			    	  java.sql.Statement myst = mycon.createStatement(); 
    			    	// 3. execution of sql 
    			    	  ResultSet myres = myst.executeQuery("select * from profile where id = 2");
    			    	// 4. Process the resultset  
    			          while(myres.next()) {
    			        	  System.out.println(myres.getString("name"));
    			        	  System.out.println(myres.getString("age"));
    			        	  System.out.println(myres.getString("job"));
    			        	  System.out.println(myres.getString("image"));    
    			          }
    			      }
    			      catch(Exception e1) {
    			    	  e1.printStackTrace();
    			      }
            	   frame.close();
            	   in.close();
            	   }
        	   if(name.equals(name3)) {
            	   try {
    			    	// 1.connection  to database
    			    	  java.sql.Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
    			    	// 2.creation of stats
    			    	  java.sql.Statement myst = mycon.createStatement(); 
    			    	// 3. execution of sql 
    			    	  ResultSet myres = myst.executeQuery("select * from profile where id =3");
    			    	// 4. Process the resultset  
    			          while(myres.next()) {
    			        	  System.out.println(myres.getString("name"));
    			        	  System.out.println(myres.getString("age"));
    			        	  System.out.println(myres.getString("job"));
    			        	  System.out.println(myres.getString("image"));    
    			          }
    			      }
    			      catch(Exception e1) {
    			    	  e1.printStackTrace();
    			      }
            	   frame.close();
            	   in.close();
            	   }
        	   if(name.equals(name4)) {
            	   try {
    			    	// 1.connection  to database
    			    	  java.sql.Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
    			    	// 2.creation of stats
    			    	  java.sql.Statement myst = mycon.createStatement(); 
    			    	// 3. execution of sql 
    			    	  ResultSet myres = myst.executeQuery("select * from profile where id = 4");
    			    	// 4. Process the resultset  
    			          while(myres.next()) {
    			        	  System.out.println(myres.getString("name"));
    			        	  System.out.println(myres.getString("age"));
    			        	  System.out.println(myres.getString("job"));
    			        	  System.out.println(myres.getString("image"));    
    			          }
    			      }
    			      catch(Exception e1) {
    			    	  e1.printStackTrace();
    			      }
            	   frame.close();
            	   in.close();
            	   }
        	   if(name.equals(name5)) {
            	   try {
    			    	// 1.connection  to database
    			    	  java.sql.Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
    			    	// 2.creation of stats
    			    	  java.sql.Statement myst = mycon.createStatement(); 
    			    	// 3. execution of sql 
    			    	  ResultSet myres = myst.executeQuery("select * from profile where id = 5");
    			    	// 4. Process the resultset  
    			          while(myres.next()) {
    			        	  System.out.println(myres.getString("name"));
    			        	  System.out.println(myres.getString("age"));
    			        	  System.out.println(myres.getString("job"));
    			        	  System.out.println(myres.getString("image"));    
    			          }
    			      }
    			      catch(Exception e1) {
    			    	  e1.printStackTrace();
    			      }
            	   frame.close();
            	   in.close();
            	   }
        	   if(name.equals(name6)) {
            	   try {
    			    	// 1.connection  to database
    			    	  java.sql.Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
    			    	// 2.creation of stats
    			    	  java.sql.Statement myst = mycon.createStatement(); 
    			    	// 3. execution of sql 
    			    	  ResultSet myres = myst.executeQuery("select * from profile where id = 6");
    			    	// 4. Process the resultset  
    			          while(myres.next()) {
    			        	  System.out.println(myres.getString("name"));
    			        	  System.out.println(myres.getString("age"));
    			        	  System.out.println(myres.getString("job"));
    			        	  System.out.println(myres.getString("image"));    
    			          }
    			      }
    			      catch(Exception e1) {
    			    	  e1.printStackTrace();
    			      }
            	   frame.close();
            	   in.close();
            	   }
        	   if(name.equals(name7)) {
            	   try {
    			    	// 1.connection  to database
    			    	  java.sql.Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
    			    	// 2.creation of stats
    			    	  java.sql.Statement myst = mycon.createStatement(); 
    			    	// 3. execution of sql 
    			    	  ResultSet myres = myst.executeQuery("select * from profile where id = 7");
    			    	// 4. Process the resultset  
    			          while(myres.next()) {
    			        	  System.out.println(myres.getString("name"));
    			        	  System.out.println(myres.getString("age"));
    			        	  System.out.println(myres.getString("job"));
    			        	  System.out.println(myres.getString("image"));    
    			          }
    			      }
    			      catch(Exception e1) {
    			    	  e1.printStackTrace();
    			      }
            	   frame.close();
            	   in.close();
        	   }	
		   });   
	   VBox layout= new VBox(30);
       layout.getChildren().addAll(l1,choice,select);
       layout.setPadding(new Insets(30,30,30,30));
       layout.setAlignment(Pos.CENTER);
       Scene scene= new Scene(layout);
       frame.setScene(scene);
       frame.showAndWait();
       l1.setText(msg);
       Button exit=new Button("Exit the Mininet");
       exit.setOnAction(e -> System.exit(0));
       VBox layout1= new VBox(30);
       layout1.getChildren().addAll(l1,exit);
       layout1.setAlignment(Pos.CENTER);
       Scene scene1= new Scene(layout1);
       frame.setScene(scene1);
       frame.showAndWait();

       }
}