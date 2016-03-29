/**
 * Dieses Modul stellt die GUI der Simulation dar.
 * Diese gibt den Raum, Tisch und die einzelnen 
 * Durchläufe aus.
 */
package module.darstellung;

/**
 * @author Tilo Ullrich : studium@tilo-ullrich.de
 */
public interface Darstellung {

	/**
	 * Diese Methode baut die GUI der Simulation
	 */
	public void ladeGUI();
	
	/**
	 * Diese Methode altualisiert die GUI. Dabei werden die
	 * Positionen der Gäste, Tische und des Raums aktualisiert.
	 */
	public void aktualisiereGUI();
	
}
