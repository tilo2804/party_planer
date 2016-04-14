package module.GUI;
// GUI-Modul
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // init the GUI controller
        party_planer_gui_controller controller = new party_planer_gui_controller();

        // init a scene
        Scene scene = controller.initScene();

        // create the room
        controller.drawSquares();

        // create the guests
        controller.drawGuests();

        // create the table
        controller.drawTable();

        // create a legend with guests names
        controller.drawLegend();

        // show the scene
        controller.showScene(primaryStage, scene);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
