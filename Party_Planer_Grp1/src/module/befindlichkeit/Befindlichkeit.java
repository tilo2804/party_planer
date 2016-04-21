package module.befindlichkeit;
import java.lang.Math;

public class Befindlichkeit {

	public Befindlichkeit() {
		
	}
	
	public float getBefindlichkeit(Gast gast, float posX, float posY) {
//		float abstand;
//		float befindlichkeit;
//		for(int i=0;i<Gästeliste.size();i++) {
//			float gastX = getGast(i).posX;
//			float gastY = getGast(i).posY;
//			float distanz2 = (posX-gastX)*(posX-gastX)+(posY-gastY)*(posY-gastY);
//			float distanz = (float) Math.sqrt(distanz2);
//			abstand = abstand + abs(distanz-gast.WunschAbstand(getGast(i)));
//		}
//		befindlichkeit = abstand;
//		return befindlichkeit;
		return (float) 1.1;
	}
}

