package uebung07;

public abstract class Kleidung
{	
	private  String farbe;
	private  boolean istTrocken;
	private  int waschzeitInMinuten;
	private  String groesse;
	
	
	
	/**
	 * 
	 * @return the colour.
	 */
	public String getFarbe()
	{
		return farbe;
	}
	/**
	 * 
	 * @param farbe sets the colour
	 */
	public void setFarbe(String farbe)
	{
		this.farbe = farbe;
	}
	/**
	 * 
	 * @return gets the value if its dry.
	 */
	public boolean isIstTrocken()
	{
		return istTrocken;
	}
	/**
	 * 
	 * @param istTrocken gives the object variable the value of the parameter.
	 */
	public void setIstTrocken(boolean istTrocken)
	{
		this.istTrocken = istTrocken;
	}
	/**
	 * 
	 * @return the washing time of the clothing
	 */
	public int getWaschzeitInMinuten()
	{
		return waschzeitInMinuten;
	}
	/**
	 * 
	 * @param waschzeitInMinuten sets the washing time.
	 */
	public void setWaschzeitInMinuten(int waschzeitInMinuten)
	{
		this.waschzeitInMinuten = waschzeitInMinuten;
	}
	/**
	 * 
	 * @return get the size of the clothing.
	 */
	public String getGroesse()
	{
		return groesse;
	}
	/**
	 * 
	 * @param groesse set the size of the clothing.
	 */
	public void setGroesse(String groesse)
	{
		this.groesse = groesse;
	}

	
	 
	 
	 /**
	  * Konstruktor
	  * @param farbe gives the clothing the colour ( Example : blue, red )
	  * @param groesse gives the clothing the size (Example: X, L, M, S)
	  */
	public Kleidung(String farbe , String groesse)
	{
		this.farbe = farbe;
		this.groesse = groesse;
		istTrocken = true;
	}
	
	
	public Kleidung(String groesse)
	{
		this.farbe = "schwarz";
		this.groesse = groesse;
	}
	
	
	//Methoden
	/**
	 * abstract methods
	 */
	public abstract void printFarbe();
	public abstract void printGroesse();
	
	
	
	
	
	
	
	
}
