package module.datenhaltung;

public class Konfiguration {
	private float speed;
	private float iteration;
	
	public Konfiguration(float newSpeed, float newIteration)
	{
		speed = newSpeed;
		iteration = newIteration;
	}
	
	public float getSpeed()
	{
		return speed;
	}
	
	public float getIteration()
	{
		return iteration;
	}
}
