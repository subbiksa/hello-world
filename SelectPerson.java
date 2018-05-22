package application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class SelectPerson {
		public static void select(String title, String msg) {
		   Stage frame= new Stage();
    	   frame.initModality(Modality.APPLICATION_MODAL);
           frame.setTitle(title);
           frame.setWidth(300);
           Label l1= new Label(title);
           l1.setText(msg);
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
   		   Button select=new Button("Select the Profile");
   		   select.setOnAction(e -> selection(choice));
           VBox layout= new VBox(30);
           layout.getChildren().addAll(l1,choice,select);
           layout.setPadding(new Insets(30,30,30,30));
           layout.setAlignment(Pos.CENTER);
           Scene scene= new Scene(layout);
           frame.setScene(scene);
           frame.showAndWait();
           }
	private static void selection(ComboBox<String> choice) {
		// TODO Auto-generated method stub
		choice.setOnAction(e->{
			System.out.println("User Selected"+choice.getValue());
				
		});
		
		
	}
        
}