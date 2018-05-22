package application;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class AddPerson {
	 static boolean response;
	 static java.sql.Connection mycon=null;
	 static java.sql.Statement myst=null;
	 public static boolean close(String title, String msg) {
	       Stage frame= new Stage();
           frame.initModality(Modality.APPLICATION_MODAL);
           frame.setTitle(title);
           frame.setWidth(300);
           Label l1= new Label(title);
           l1.setText(msg);
           Button yes = new Button("Add details on the console");
           yes.setOnAction(e-> 
           {
        	   response=true;
        	   @SuppressWarnings("resource")
			   Scanner in = new Scanner(System.in);
        	   System.out.println("Enter your profile name: ");
        	   String name =in.nextLine();
        	   System.out.println("Enter your Age: ");
        	   String age= in.nextLine();
        	   System.out.println("Enter your status: ");
        	   String job = in.nextLine();
        	   System.out.println("Enter your image: ");
        	   String image = in.nextLine();
        	   System.out.println("Enter your phNo: ");
        	   String num = in.nextLine();
        	   try {
        	    	// 1.connection  to database
        	    	   mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mininet?autoReconnect=true&useSSL=false","root","root"); 
        	    	   if(mycon!=null) {
        	    		   System.out.println("Connection Success");
        	    	   }else {System.out.println("Local Database Not Found!");}
        	    	   // 2.creation of stats
        	    	   String sql = "insert into profile(id,name, age, job, image)" + " values (?,?,?,?,?)";
        	    	   PreparedStatement pdStmt = mycon.prepareStatement(sql);
        	    		// set param values
        	    	   pdStmt.setString(1,num);
        	    	   pdStmt.setString (2,name );
        	    	   pdStmt.setString (3,age);
        	    	   pdStmt.setString (4,job );
        	    	   pdStmt.setString (5,image);
       				// 3. Execute SQL query
        	    		pdStmt.execute();
     		     		System.out.println("Successfully inserted");
     		     		System.out.println("New Profile Added to the Network!");
        	    	   myst.close();
        	           mycon.close(); 
        	           
        	    	  // 4. Insert the string  
        	          
        		}
        	      catch(Exception e1) {
        	    	 // System.out.println("Added to the network!");
        	      } 
               frame.close();
           });
           Button no = new Button("Dont Add and Exit");
           no.setOnAction(e -> {
        	   response=false;
               frame.close();
        	   });
           VBox layout= new VBox(30);
           layout.getChildren().addAll(l1,yes,no);
           layout.setAlignment(Pos.CENTER);
           Scene scene= new Scene(layout);
           frame.setScene(scene);
           frame.showAndWait();
           return response;
           }
}
