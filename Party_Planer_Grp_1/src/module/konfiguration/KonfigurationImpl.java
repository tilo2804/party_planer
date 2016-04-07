/**
 * 
 */
package module.konfiguration;

import module.datenhaltung.Datenhaltung;

/**
 * @author Tilo Ullrich : studium@tilo-ullrich.de
 *
 */
public class KonfigurationImpl implements Konfiguration {

	private Datenhaltung datenhaltung;
	
	public KonfigurationImpl(Datenhaltung datenhaltung) {
		this.datenhaltung = datenhaltung;
	}

	/**
	 * @see module.konfiguration.Konfiguration#ladeGUI()
	 */
	@Override
	public void importConfig() {
		// TODO Auto-generated method stub

	}

}
