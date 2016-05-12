package module.datenhaltung;

public class Tisch {
	private float posX;
	private float posY;
	private float hight;
	private float width;
	
	public Tisch(float newPosX, float newPosY, float hight,float width)
	{
		posX = newPosX;
		posY = newPosY;
		this.hight = hight;
		this.width = width;
	}
	
	public float getX()
	{
		return posX;
	}
	
	public float getY()
	{
		return posY;
	}
	
	public float getHight()
	{
		return hight;
	}
	
	public float getWidth()
	{
		return width;
	}
}
