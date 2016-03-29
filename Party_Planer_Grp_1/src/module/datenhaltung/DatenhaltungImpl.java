/**
 * 
 */
package module.datenhaltung;

import java.util.Map;

/**
 * @author Tilo Ullrich : studium@tilo-ullrich.de
 *
 */
public class DatenhaltungImpl implements Datenhaltung {

	/**
	 * @see module.datenhaltung.Datenhaltung#newGast(java.lang.String, java.lang.String)
	 */
	@Override
	public void newGast(String name, String beruf) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getGaesteliste()
	 */
	@Override
	public Map<Integer, String> getGaesteliste() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#setWunschAbstand(int, int, int)
	 */
	@Override
	public void setWunschAbstand(int gast1Nummer, int abstand, int gast2Nummer) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getWunschAbstand(int, int)
	 */
	@Override
	public int getWunschAbstand(int gast1Nummer, int gast2Nummer) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getBeruf(java.lang.String)
	 */
	@Override
	public String getBeruf(int gastNummer) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#setBefindlichkeit(int, int)
	 */
	@Override
	public void setBefindlichkeit(int gastNummer, int befindlichkeit) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getBefindlichkeit(int)
	 */
	@Override
	public int getBefindlichkeit(int gastNummer) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getGastHistorieBefindlichkeit(int)
	 */
	@Override
	public Map<Integer, Integer> getGastHistorieBefindlichkeit(int gastnummer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @see module.datenhaltung.Datenhaltung#getGastPosX(int)
	 */
	@Override
	public int getGastPosX(int gastNummer) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getGastPosY(int)
	 */
	@Override
	public int getGastPosY(int gastNummer) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#setGastPosX(int, int)
	 */
	@Override
	public void setGastPosX(int gastNummer, int posX) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see module.datenhaltung.Datenhaltung#setGastPosY(int, int)
	 */
	@Override
	public void setGastPosY(int gastNummer, int posY) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getGastHistoriePosX(int)
	 */
	@Override
	public Map<Integer, Integer> getGastHistoriePosX(int gastnummer) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getGastHistoriePosY(int)
	 */
	@Override
	public Map<Integer, Integer> getGastHistoriePosY(int gastnummer) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#newTisch(int, int, int, int)
	 */
	@Override
	public void newTisch(int laenge, int breite, int posX, int posY) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getTischLaenge()
	 */
	@Override
	public int getTischLaenge() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getTischBreite()
	 */
	@Override
	public int getTischBreite() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getTischPosX()
	 */
	@Override
	public int getTischPosX() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getTischPosY()
	 */
	@Override
	public int getTischPosY() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#newRaum(int, int)
	 */
	@Override
	public void newRaum(int laenge, int breite) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getRaumLaenge()
	 */
	@Override
	public int getRaumLaenge() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getRaumBreite()
	 */
	@Override
	public int getRaumBreite() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#setGeschwindigkeit(int)
	 */
	@Override
	public void setGeschwindigkeit(int geschwindigkeit) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getGeschwindigkeit()
	 */
	@Override
	public int getGeschwindigkeit() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#setAnzahlDurchlaeufe(int)
	 */
	@Override
	public void setAnzahlDurchlaeufe(int durchlaeufe) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see module.datenhaltung.Datenhaltung#getAnzahlDurchlaeufe()
	 */
	@Override
	public int getAnzahlDurchlaeufe() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see module.datenhaltung.Datenhaltung#reset()
	 */
	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

}
