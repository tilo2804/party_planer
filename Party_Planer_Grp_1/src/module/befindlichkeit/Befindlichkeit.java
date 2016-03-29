/**
 * In diesem Modul wird die Befindlichkeit einer Person am Ende
 * eines Durchlaufes berechnet.
 */
package module.befindlichkeit;

import java.util.Map;

/**
 * @author Tilo Ullrich : studium@tilo-ullrich.de
 *
 */
public interface Befindlichkeit {

	/**
	 * Diese Methode berechnet die Befindlichkeiten aller Gäste
	 * und übergibt sie an die Datenhaltung.
	 */
	public void befindlichkeitBerechnen();
	
	/**
	 * Diese Methode gibt eine Liste mit allen Position zurück die
	 * der Gast erreichen kann. Die Liste geginnt mit der besten Positiion
	 * und endet mit der für den Gast unbefriedigenden Position.
	 * @param gastNummer : Nummer des Gastes
	 * @return Map : Key = X-Wert : Value = Y-Wert
	 */
	public Map<Integer, Integer> getBestenPositionen(int gastNummer);
	
}
