package module.GUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import module.datenhaltung.Datenhaltung;
import module.datenhaltung.DatenhaltungImpl;
import module.konfiguration.Konfiguration;
import module.konfiguration.KonfigurationImpl;
import module.statistik.Statistik;
import module.statistik.StatistikImpl;
import module.steuerung.Steuerung;
import module.steuerung.SteuerungImpl;


public class party_planer_gui_controller {

	Datenhaltung datenhaltung = new DatenhaltungImpl();
	Steuerung steuerung = new SteuerungImpl(datenhaltung);
	Konfiguration konfiguration = new KonfigurationImpl(datenhaltung);
	Statistik statistik = new StatistikImpl(datenhaltung);
	
	@FXML Button buttonStart;
	@FXML Button buttonPause;
	@FXML Button buttonNextStep;
	@FXML Button buttonNextIteration;

    @FXML StackPane main;
    @FXML GridPane zimmerGrid;
    @FXML ListView legende;
    @FXML VBox rightBox;


    final int width = 900; // Scene width
    final int height = 700; // Scene height
    final int centerColumnWidth = 600;
    final int rightColumnWidth = 290; // minus 10 margin on the right

    // TODO: get room size from config
    final int roomWidth = 600; // Zimmerlänge
    final int roomHeight = 400; // Zimmerhöhe
    final int squareSize = 40; // Zellgröße

    // TODO: get table from config
    final int tableWidth = 4; // number of squares
    final int tableHeight = 2; // number of squares
    final int tablePosX = 5;
    final int tablePosY = 4;

    // TODO: get guests list from config
    Object[][] guests = new Object[][]{
            { "Brigitte", "Börsenmaklerin", 3, 3 },
            { "Penelope", "Prinzessin", 2, 0 },
            { "Willi", "Gewichtheber", 0, 1 }
    };



    protected Scene initScene() throws Exception {
        // create a loader
        FXMLLoader loader = new FXMLLoader(getClass().getResource("party_planer_gui.fxml"));

        // set this instance as its controller
        loader.setController(this);

        // create a scene
        Parent root = loader.load();
        return new Scene(root, width, height);
    }



    protected void showScene(Stage primaryStage, Scene scene) {
        primaryStage.setTitle("Party Planer");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }



    protected void drawSquares() {
        // set the room size
        zimmerGrid.setMinWidth(roomWidth);
        zimmerGrid.setMinHeight(roomHeight);

        // add squares to the room
        for (int col = 0; col < roomWidth/squareSize; col++) {
            for (int row = 0; row < roomHeight/squareSize; row++) {
                Rectangle square = drawOneSquare(Color.TRANSPARENT);
                // add the square to the GridPain #zimmerGrid
                zimmerGrid.add(square, col, row);
            }
        }
    }


    protected Rectangle drawOneSquare(Color color) {
        Rectangle square = new Rectangle(squareSize, squareSize);
        square.setFill(color);
        square.setStroke(Color.BLACK);
        square.setStrokeType(StrokeType.INSIDE);
        square.setStrokeWidth(1);
        return square;
    }



    protected void drawGuests() {
        // add the guests to the squares
        for (int i = 0; i < guests.length; i++) {
            // get the current guests's data
            Text letter = new Text(guests[i][0].toString().substring(0, 1));
            int guestPosX = (int)guests[i][2];
            int guestPosY = (int)guests[i][3];
            // create a new square with background
            Rectangle square = drawOneSquare(Color.DODGERBLUE);
            // add to the room the square and the guests's letter
            zimmerGrid.add(square, guestPosX, guestPosY);
            zimmerGrid.add(letter, guestPosX, guestPosY);
            // align the letter in the center
            zimmerGrid.setHalignment(letter, HPos.CENTER);
        }
    }

    protected void drawLegend() {
        ObservableList<String> legendItems = FXCollections.observableArrayList();

        for (int i = 0; i < guests.length; i++) {
            String name = guests[i][0].toString();
            String text = name.substring(0, 1) + ": " + name;
            legendItems.add(text);
        }

        legende.setItems(legendItems);

        rightBox.setPrefWidth(rightColumnWidth);
    }


    protected void drawTable() {
        // add the table squares
        for (int x = tablePosX; x < tablePosX+tableWidth; x++) {
            for (int y = tablePosY; y < tablePosY+tableHeight; y++)
            {
                Text letter = new Text("T");
                // create a new square with background
                Rectangle square = drawOneSquare(Color.CHOCOLATE);

                // add to the room the square and the guests's letter
                zimmerGrid.add(square, x, y);
                zimmerGrid.add(letter, x, y);
                // align the letter in the center
                zimmerGrid.setHalignment(letter, HPos.CENTER);
            }
        }
    }


    public Node getGridPaneNode(final int row, final int column, GridPane gridPane) {
        Node result = null;
        ObservableList<Node> childrens = gridPane.getChildren();
        for(Node node : childrens) {
            if(gridPane.getRowIndex(node) == row && gridPane.getColumnIndex(node) == column) {
                result = node;
                break;
            }
        }
        return result;
    }


    @FXML private void buttonStartAction(ActionEvent event) {
        System.out.println("Steuerung Befehl Start");
        steuerung.startSimulation();
    }

    @FXML private void buttonPauseAction(ActionEvent event) {
        System.out.println("Steuerung Befehl Pause");
        steuerung.stopSimulation();
    }

    @FXML private void buttonStopAction(ActionEvent event) {
        System.out.println("Steuerung Befehl Stopp");
        steuerung.startSimulation();
    }

    @FXML private void buttonNextIterationAction(ActionEvent event) {
        System.out.println("Steuerung Befehl n�chste Iteration");
        steuerung.nextIteration();
    }

    @FXML private void buttonNextStepAction(ActionEvent event) {
        System.out.println("Steuerung Befehl n�chster Schritt");
        steuerung.nextStep();
    }

}
