/**
 * 
 */
package module.statistik;

import module.datenhaltung.Datenhaltung;

/**
 * @author Tilo Ullrich : studium@tilo-ullrich.de
 *
 */
public class StatistikImpl implements Statistik {

	private Datenhaltung datenhaltung;
	
	public StatistikImpl(Datenhaltung datenhaltung) {
		this.datenhaltung = datenhaltung;
	}

	/**
	 * @see module.statistik.Statistik#ladeGUI()
	 */
	@Override
	public void ladeGUI() {
		// TODO Auto-generated method stub

	}

}
