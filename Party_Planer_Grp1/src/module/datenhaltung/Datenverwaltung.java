package module.datenhaltung;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface Datenverwaltung {
	public void writeCofickToFile()throws IOException;
	
	public Tisch loadTisch();
	public boolean saveTisch(Tisch tisch);
	
	public Raum loadRaum();
	public boolean saveRaum(Raum raum);
	
	public Konfiguration loadCofick();
	public boolean saveCofick(Konfiguration cofick);
	
	public List<Partygast> loadPartygäste();
	public boolean savePartygast(Partygast gast);
	public boolean deletePartygast(Partygast partygast);
	
	public boolean saveState(ArrayList<Partygast> gästeliste);
	public ArrayList<ArrayList<Partygast>> loadStates();
}
