/**
 * Dieses Modul erstellt mit den Eingaben des Nutzers eine Konfiguration
 * für die Simulation. Diese enthält folgende Daten:
 *  Gästeliste : Namen und Beruf der Gäste in einer Liste
 *  Wunschabstände : Die Wunschabstände aller Gäste
 *  Raumdaten : Die Größe des Raumes (groeßeX und groeßeY)
 *  Tischdaten : Die Größe und Position des Tisches (posX, posY, groeßeX, groeßeY)
 *  			 mehrere Tische möglich !!!
 *  Geschwindigkeit der Simulation : Abstand in Sekunden zwischen 2 Iterationen
 *  Anzahl der Durchläufe : Anzahl der Iterationen
 */
package module.konfiguration;

/**
 * @author Tilo Ullrich : studium@tilo-ullrich.de
 *
 */
public interface Konfiguration {

	/**
	 * Mit diesem Befehl wird die GUI der Konfiguration geladen.
	 * In diese kann der Nutzer seine Konfigurationen für die 
	 * Simulation eintragen oder eine Date laden lassen in der 
	 * sich die Konfigurationseinstellungen befinden.
	 * Die Funktion übergibt die Daten an die Datenhaltung.
	 * Nach der Übertragung aller Konfigurationseinstellungen
	 * wird die Simulation über die Steuerung gestartet.
	 */
	public void ladeGUI();
	
}
