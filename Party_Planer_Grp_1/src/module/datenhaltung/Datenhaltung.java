/**
 * Diese Modul erh�lt alle Daten des Programms von den anderen Modulen.
 * Diese Daten werden von der Datenhaltung verwaltet und gespeichert.
 */
package module.datenhaltung;

import java.util.Map;

/**
 * @author Tilo Ullrich : studium@tilo-ullrich.de
 *
 */
public interface Datenhaltung {

	//##################################################//
	//##################### Gast #######################//
	//##################################################//
	
	/**
	 * Diese Methode erstellt ein Objekt der Klasse Gast mit
	 * den Parametern Name und Beruf.
	 * @param name : Name des Gastes
	 * @param beruf : Beruf des Gastes
	 */
	public void newGast(String name,
						String beruf);
	
	/**
	 * Diese Methode gibt eine G�steliste zur�ck, die alle 
	 * G�ste mit ihrer Nummer enth�lt.
	 * @return Map mit Nummer und Name des Gastes
	 */
	public Map<Integer, String> getGaesteliste();
	
	/**
	 * Diese Methode setzt den Wunschabstand des Gast1 zum Gast2
	 * @param gast1Nummer : Nummer des Gastes 1
	 * @param abstand : Wunschabstand
	 * @param gast2Nummer : Nummer des Gastes 2
	 */
	public void setWunschAbstand(int gast1Nummer,
								 int abstand,
								 int gast2Nummer);
	
	/**
	 * Diese Methode gibt den Wunschabstand des Gast1 zum Gast2 zur�ck
	 * @param gast1Nummer : Nummer des Gastes 1
	 * @param gast2Nummer : Nummer des Gastes 2
	 * @return Wunschabstand
	 */
	public int getWunschAbstand(int gast1Nummer,
								int gast2Nummer);
	
	/**
	 * Gibt Beruf des Gastes zur�ck
	 * @param gastNummer : Nummer des Gastes
	 * @return Beruf
	 */
	public String getBeruf(int gastNummer);
	
	/**
	 * setzt die Befindlichkeit eines Gastes
	 * @param gastNummer
	 */
	public void setBefindlichkeit(int gastNummer, int befindlichkeit);
	
	/**
	 * Gibt die aktuelle Befindlichkeit eines Gastes zur�ck
	 * @param gastNummer : Nummer des Gastes
	 * @return aktuelle Befindlichkeit des Gastes
	 */
	public int getBefindlichkeit(int gastNummer);
	
	/**
	 * Gibt die Historie der Befindlichkeit eines Gastes w�hrend der Simulation zur�ck
	 * @param gastnummer : Nummer des Gastes
	 * @return Map mit Key = Durchlauf, Value = Befindlichkeit am Ende des Durchlaufes
	 */
	public Map<Integer, Integer> getGastHistorieBefindlichkeit(int gastnummer);
	
	/**
	 * Gibt die Position des Gastes an der X-Achse zur�ck
	 * @param gastNummer : Nummer des Gastes
	 * @return Position an der X-Achse
	 */
	public int getGastPosX(int gastNummer);
	
	/**
	 * Gibt die Position des Gastes an der Y-Achse zur�ck
	 * @param gastNummer : Nummer des Gastes
	 * @return Position an der Y-Achse
	 */
	public int getGastPosY(int gastNummer);
	
	/**
	 * Setzt die Position des Gastes an der X-Achse
	 * @param gastNummer : Nummer des Gastes
	 * @param posX: Position an der X-Achse
	 */
	public void setGastPosX(int gastNummer, int posX);
	
	/**
	 * Setzt die Position des Gastes an der Y-Achse
	 * @param gastNummer : Nummer des Gastes
	 * @param posY: Position an der Y-Achse
	 */
	public void setGastPosY(int gastNummer, int posY);
	
	/**
	 * Gibt die Historie der Position eines Gastes an der X-Achse zur�ck
	 * @param gastnummer : Nummer des Gastes
	 * @return Map mit Key = Durchlauf, Value = Position an der X-Achse
	 */
	public Map<Integer, Integer> getGastHistoriePosX(int gastnummer);
	
	/**
	 * Gibt die Historie der Position eines Gastes an der Y-Achse zur�ck
	 * @param gastnummer : Nummer des Gastes
	 * @return Map mit Key = Durchlauf, Value = Position an der Y-Achse
	 */
	public Map<Integer, Integer> getGastHistoriePosY(int gastnummer);

	
	//##################################################//
	//##################### Tisch ######################//
	//##################################################//
	
	/**
	 * Erstellt ein Objekt der Klasse Tisch mit den Parametern:
	 * @param : laenge L�nge des Tischs
	 * @param : breite Breite des Tischs
	 * @param : posX Position des Tischs an der X-Achse
	 * @param : posY Position des Tischs an der Y-Achse
	 */
	public void newTisch(int laenge,
						 int breite,
						 int posX,
						 int posY);
	
	/**
	 * Gibt die L�nge des Tischs zur�ck
	 * @return L�nge des Tischs
	 */
	public int getTischLaenge();
	
	/**
	 * Gibt die Breite des Tischs zur�ck
	 * @return Breite des Tischs
	 */
	public int getTischBreite();
	
	/**
	 * Gibt die Position des Tischs an der X-Achse zur�ck
	 * @return Position an der X-Achse
	 */
	public int getTischPosX();
	
	/**
	 * Gibt die Position des Tischs an der Y-Achse zur�ck
	 * @return Position an der Y-Achse
	 */
	public int getTischPosY();
	
	//##################################################//
	//##################### Raum #######################//
	//##################################################//
	
	/**
	 * Erstellt ein Objekt der Klasse Raum mit den Parametern:
	 * @param laenge L�nge des Raums
	 * @param breite Breite des Raums
	 */
	public void newRaum(int laenge,
						int breite);
	
	/**
	 * Gibt die Rauml�nge zur�ck
	 * @return Rauml�nge
	 */
	public int getRaumLaenge();
	
	/**
	 * Gibt die Raumbreite zur�ck
	 * @return Raumbreite
	 */
	public int getRaumBreite();
	
	//##################################################//
	//################## Konfiguration #################//
	//##################################################//
			
	/**
	 * Setzt die Geschwindigkeit der Simulation. Diese legt 
	 * fest, welche Zeit zwischen zwei Iterationen vergeht.
	 * @param geschwindigkeit Simulationsgeschwindigkeit
	 */
	public void setGeschwindigkeit(int geschwindigkeit);
	
	/**
	 * Gibt die Geschwindigkeit der Simulation zur�ck
	 * @return Simulationsgeschwindigkeit
	 */
	public int getGeschwindigkeit();
	
	/**
	 * Setzt die Anzahl der Durchl�ufe einer Simulation
	 * @param durchlaeufe
	 */
	public void setAnzahlDurchlaeufe(int durchlaeufe);
	
	/**
	 * Gibt Anzahl der Durchl�ufe zur�ck
	 * @return Anzahl der Durchl�ufe
	 */
	public int getAnzahlDurchlaeufe();
	
	/**
	 * Setzt alle Einstellungen zur�ck.
	 */
	public void reset(); 
}
