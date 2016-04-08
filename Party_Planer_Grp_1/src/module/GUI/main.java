package module.GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception {

        // init the GUI controller
        party_planer_gui_controller controller = new party_planer_gui_controller();

        // init a scene
        Scene scene = controller.initScene();

        // draw the room
        controller.drawSquares();

        // draw guests
        controller.drawGuests();

        // draw table
        controller.drawTable();

        controller.drawLegend();

        // show the scene
        controller.showScene(primaryStage, scene);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
