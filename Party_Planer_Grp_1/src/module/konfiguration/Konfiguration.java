/**
 * Dieses Modul erstellt mit den Eingaben des Nutzers eine Konfiguration
 * f�r die Simulation. Diese enth�lt folgende Daten:
 *  G�steliste : Namen und Beruf der G�ste in einer Liste
 *  Wunschabst�nde : Die Wunschabst�nde aller G�ste
 *  Raumdaten : Die Gr��e des Raumes (groe�eX und groe�eY)
 *  Tischdaten : Die Gr��e und Position des Tisches (posX, posY, groe�eX, groe�eY)
 *  			 mehrere Tische m�glich !!!
 *  Geschwindigkeit der Simulation : Abstand in Sekunden zwischen 2 Iterationen
 *  Anzahl der Durchl�ufe : Anzahl der Iterationen
 */
package module.konfiguration;

/**
 * @author Tilo Ullrich : studium@tilo-ullrich.de
 *
 */
public interface Konfiguration {

	/**
	 * Mit diesem Befehl wird die GUI der Konfiguration geladen.
	 * In diese kann der Nutzer seine Konfigurationen f�r die 
	 * Simulation eintragen oder eine Date laden lassen in der 
	 * sich die Konfigurationseinstellungen befinden.
	 * Die Funktion �bergibt die Daten an die Datenhaltung.
	 * Nach der �bertragung aller Konfigurationseinstellungen
	 * wird die Simulation �ber die Steuerung gestartet.
	 */
	public void ladeGUI();
	
}
