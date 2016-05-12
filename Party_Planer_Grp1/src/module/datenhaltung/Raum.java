package module.datenhaltung;

public class Raum {
	private float hight;
	private float width;
	private float sizefactor;
	
	public Raum(float hight,float width,float sizefactor)
	{
		this.hight = hight;
		this.width = width;
		this.sizefactor = sizefactor;
	}
	
	public float getHight()
	{
		return hight;
	}
	
	public float getWidth()
	{
		return width;
	}
	
	public float getSizefactor()
	{
		return sizefactor;
	}
}
