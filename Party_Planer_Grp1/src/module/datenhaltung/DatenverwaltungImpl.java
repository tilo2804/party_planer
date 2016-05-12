package module.datenhaltung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DatenverwaltungImpl implements Datenverwaltung {

	private Tisch table;
	private Raum room;
	private Konfiguration cofick;
	private ArrayList<Partygast> guestlist;
	private int counter; // Zählen der durchgeführten Iterationen
	private int iteration = 100;
	private float delay = 1.0f;
	private ArrayList<ArrayList<Partygast>> simulationstates;
	
	public void Datenverwaltung()
	{
		counter = 0;
		guestlist = new ArrayList<>();
		simulationstates = new ArrayList<>();
		loadFiles();
	}
	
	private void loadFiles() {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("room.ppk"));
			JSONObject jsonObject = (JSONObject)obj;
			this.room = new Raum(
					(float)jsonObject.get("Raumlänge"),
					(float)jsonObject.get("Raumbreite"),
					(float)jsonObject.get("Skalierung"));
			this.table = new Tisch(
					(float)jsonObject.get("TischX"),
					(float)jsonObject.get("TischY"),
					(float)jsonObject.get("Tischlänge"),
					(float)jsonObject.get("Tischbreite"));
			this.delay = (float)jsonObject.get("Verzögerung");
			this.iteration = (Integer)jsonObject.get("Iterationen");
		} catch (Exception e) {
			System.out.println(e);
		}

		this.guestlist.clear();
		
		try {
			Object obj = parser.parse(new FileReader("guestlist.ppg"));
			JSONObject jsonObject = (JSONObject)obj;
			JSONArray guestArray = (JSONArray)jsonObject.get("Gästeliste");
			for(int i = 0;i<guestArray.size(); i++) {
				JSONObject guest = (JSONObject) guestArray.get(i);
				Partygast newGast = new Partygast((Integer)guest.get("ID"),
						(float)guest.get("StartX"),
						(float)guest.get("StartY"),
						(String)guest.get("Name"),
						(String)guest.get("Beruf"),
						0);
				Map<Integer,Float> wunschabstände = new HashMap<>();
				JSONArray distances =(JSONArray)guest.get("Abstände");
				for(int j = 0;j<distances.size(); j++) {
					String[] parts = ((String)distances.get(i)).split(":");
					wunschabstände.put(Integer.parseInt(parts[0]), Float.parseFloat(parts[0]));
				}
				newGast.setWunschabstand(wunschabstände);
				this.guestlist.add(newGast);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void writeCofickToFile() throws IOException {
		JSONObject roomObj = new JSONObject();
		roomObj.put("Raumbreite", room.getWidth());
		roomObj.put("Raumlänge", room.getHight());
		roomObj.put("Skalierung", room.getSizefactor());
		roomObj.put("Tischbreite", table.getWidth());
		roomObj.put("Tischlänge", table.getHight());
		roomObj.put("TischX", table.getX());
		roomObj.put("TischY", table.getY());
		roomObj.put("Iterationen", iteration);
		roomObj.put("Verzögerung", delay);
		
		JSONObject guestlistObj = new JSONObject();
		JSONArray guestArray = new JSONArray();
		for (Partygast partygast : guestlist) {
			JSONObject guest = new JSONObject();
			guest.put("ID", partygast.getID());
			guest.put("Name", partygast.getName());
			guest.put("Beruf", partygast.getBeruf());
			guest.put("StartX", partygast.getX());
			guest.put("StartY", partygast.getY());
			JSONArray distances = new JSONArray();
			for (Entry<Integer, Float> entry : partygast.getWunschabstand().entrySet())
			{
			    distances.add(entry.getKey().toString() + ":" + entry.getValue());
			}
			guest.put("Abstände", distances);
			guestArray.add(guest);
		}
		guestlistObj.put("Gästeliste", guestArray);
		
		saveObjectToFile(roomObj, "room.ppk");
		saveObjectToFile(guestlistObj, "guestlist.ppg");
	}
	
	private void saveObjectToFile(JSONObject object,String fileName) throws IOException {
		try {
			FileWriter file = new FileWriter(fileName);
			file.write(object.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e){
			throw e;
		}
	}
	
	@Override
	public Tisch loadTisch() {
		return this.table;
	}

	@Override
	public boolean saveTisch(Tisch tisch) {
		this.table = tisch;
		return true;
	}

	@Override
	public Raum loadRaum() {
		return this.room;
	}

	@Override
	public boolean saveRaum(Raum raum) {
		this.room = raum;
		return true;
	}

	@Override
	public Konfiguration loadCofick() {
		return this.cofick;
	}

	@Override
	public boolean saveCofick(Konfiguration cofick) {
		this.cofick = cofick;
		return true;
	}

	@Override
	public List<Partygast> loadPartygäste() {
		return this.guestlist;
	}

	@Override
	public boolean savePartygast(Partygast gast) {
		this.guestlist.add(gast);
		return true;
	}

	@Override
	public boolean deletePartygast(Partygast partygast) {
		this.guestlist.remove(partygast);
		return true;
	}

	@Override
	public boolean saveState(ArrayList<Partygast> gästeliste) {
		counter++;
		this.simulationstates.add(gästeliste);
		return true;
	}

	@Override
	public ArrayList<ArrayList<Partygast>> loadStates() {
		return this.simulationstates;
	}

}
