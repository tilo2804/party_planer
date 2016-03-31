package module.GUI;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("party_planer_gui"));
	    
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Party Planer");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
