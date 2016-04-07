package module.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("party_planer_gui.fxml")); 
        
        primaryStage.setTitle("Party Planer");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {
    	
		launch();		
	}
} 