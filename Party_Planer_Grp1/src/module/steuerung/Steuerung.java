package module.steuerung;

public class Steuerung {
	
	/**
	 * possible: start, stop, pause, nextIteration, nextGuest
	 */
	private String state = "stop";
	
	/**
	 * counts iterations
	 */
	private int iterations = 0;
	
	/*
	private void mainLoop() {
		while(state.equals("start") {
			liste = load partygäste;
			for(Gast gast : liste) {
				nextField(gast);
				party_planer_gui_controller.refresh();
			}
			iterations++;
		}
	}
	
	Befindlichkeit befindlichkeit = new Befindlichkeit();
	private void nextField(Gast gast) {
		float x = gast.getX;
		float y = gast.getY;
		float besteBefindlichkeit = gast.getBefindlichkeit, besteX=x, besteY=y;
		for(int x=getX-1; x<getX+2; x++){
			if(x>=0 && x<=xMax) {
				for(int y=getY-1; y<getY+2; y++) {
					if(y>=0 && y<=yMax) {
						if(kein gast auf feld) {
							float i = befindlichkeit.getBefindlichkeit();
							if(i<besteBefindlichkeit) {
								besteBefindlichkeit = i;
								besteX = x;
								besteY = y;
							}
						}
					}
				}
			}
		}
		gast.setX(x);
		gast.setY(y);
		gast.setBefindlichkeit(besteBefindlichkeit);
	}
	
	*/
	
	/**
	 * sets the state of the app
	 * possible: start, stop, pause, nextIteration, nextGuest
	 * 
	 * @param buttonLabel
	 */
	public void setState(String buttonLabel) {
		if(buttonLabel.equalsIgnoreCase("start")) {
			if(!state.equals("start")) {
				state = "start";
				//mainLoop();
				System.out.println(state);
			}
		}
		else if(buttonLabel.equalsIgnoreCase("stop")) {
			state = "stop";
			System.out.println(state);
		}
		else if(buttonLabel.equalsIgnoreCase("pause")) {
			state = "pause";
			System.out.println(state);
		}
		else if(buttonLabel.equalsIgnoreCase("nextIteration")) {
			state = "nextIteration";
			System.out.println(state);
		}
		else if(buttonLabel.equalsIgnoreCase("nextGuest")) {
			state = "nextGuest";
			System.out.println(state);
		}
		else {
			System.out.println("No valid input.");
		}
	}
	
	/**
	 * gets iterations
	 * @return iterations
	 */
	public int getIterations() {
		return iterations;
	}
}
