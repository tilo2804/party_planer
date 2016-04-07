package module.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
	
	@FXML private void start(ActionEvent event) {
		System.out.println("Steuerung Befehl Start");
		steuerung.startSimulation();
	}
	
	@FXML private void pause(ActionEvent event) {
		System.out.println("Steuerung Befehl Pause");
		steuerung.stopSimulation();
	}
	
	@FXML private void nextIteration(ActionEvent event) {
		System.out.println("Steuerung Befehl nächste Iteration");
		steuerung.nextIteration();
	}
	
	@FXML private void nextStep(ActionEvent event) {
		System.out.println("Steuerung Befehl nächster Schritt");
		steuerung.nextStep();
	}
}
