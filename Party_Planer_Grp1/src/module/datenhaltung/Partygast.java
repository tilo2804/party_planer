package module.datenhaltung;

import java.util.Map;

public class Partygast {
	private int id;
	private float posX;
	private float posY;
	private String name;
	private String beruf;
	private float befindlichkeit;
	private Map<Integer,Float> wunschabstände;
	
	public Partygast(int id,float posX,float posY,String name,String beruf,float befindlichkeit)
	{
		this.id = id;
		this.posX = posX;
		this.posY = posY;
		this.name = name;
		this.beruf = beruf;
		this.befindlichkeit = befindlichkeit;
	}
	
	public int getID() {
		return id;
	}
	 
	public float getX()
	{
		return posX;
	}
	
	public float getY()
	{
		return posY;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBeruf()
	{
		return beruf;
	}
	
	public float getBefindlichkeit()
	{
		return befindlichkeit;
	}
	
	public void setBefindlichkeit(float befindlichkeit)
	{
		this.befindlichkeit = befindlichkeit;
	}
	
	public Map<Integer, Float> getWunschabstand()
	{
		return wunschabstände;
	}
	
	public void setWunschabstand(Map<Integer, Float> wunschabstände)
	{
		this.wunschabstände = wunschabstände;
	}
}
