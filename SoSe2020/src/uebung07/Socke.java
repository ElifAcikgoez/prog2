package uebung07;

public class Socke extends Kleidung implements Waschbar
{
	/**
	 * 
	 * @param farbe is the colour of the sock.
	 * @param groesse is the sock size.
	 */
	public Socke(String farbe, String groesse)
	{
		super(farbe, groesse);
		
	}
	/**
	 * Printes the colour of the item.
	 */
	@Override
	public void printFarbe()
	{
		System.out.println("Ich bin eine Socke und ich bin "+ getFarbe());
		
	}
	/**
	 * Printes the size of the item.
	 */
	@Override
	public void printGroesse()
	{
		System.out.println("Ich bin eine Socke in der Größe "+ getGroesse());
		setzeWaschZeit();
	}
	/**
	 * overrides the setIstTrocken value to true.
	 */
	@Override
	public void trockne()
	{
		setIstTrocken(true);
		
	}
	/**
	 * overrides the setIstTrocken value to true.
	 */
	@Override
	public void wasche()
	{
		setIstTrocken(false);
		
	}

	@Override
	public boolean isTrocken()
	{
		
		return isIstTrocken();
	}
	/**
	 * overrides the washing time to 90 mins for a pair of socks .
	 */
	@Override
	public void setzeWaschZeit()
	{
		setWaschzeitInMinuten(90);		
	}
	
	

}
