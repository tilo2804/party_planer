/**
 * 
 */
package module.steuerung;

/**
 * @author Tilo Ullrich : studium@tilo-ullrich.de
 *
 */
public interface Steuerung {

	/**
	 * Diese Methode startet die Simulation.
	 * Dafür werden Positionsdaten der Gäste gelesen,
	 * die besten Positionen berechnet und die GUI geladen
	 * und aktualisiert.
	 */
	public void startSimulation();
	//test
	
	public void stopSimulation();
	
	public void nextStep();
	
	public void nextIteration();
}
