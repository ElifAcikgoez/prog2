package uebung07;

public class Hose extends Kleidung implements Waschbar
/**
 * @author Elif Acikgoez
 * @version 1.0
 */
{

	/**
	 * Printes the colour of the item.
	 */
	@Override
	public void printFarbe()
	{
		System.out.println("Ich bin eine Hose und ich bin "+ getFarbe());
		
	}
	/**
	 * Printes the size of the item.
	 */
	@Override
	public void printGroesse()
	{
		System.out.println("Ich bin eine Hose in der Größe "+getGroesse());
		
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
	/**
	 * 
	 */
	@Override
	public boolean isTrocken()
	{
		
		return isIstTrocken();
	}
	/**
	 * overrides the washing time to 60 mins for a pant.
	 */
	@Override
	public void setzeWaschZeit()
	{
		setWaschzeitInMinuten(60);		
	}
	/**
	 * 
	 * @param farbe is the colour of the pant.
	 * @param groesse is the pant size.
	 */
	public Hose(String farbe, String groesse)
	{
		super(farbe, groesse);
		setzeWaschZeit();
		
	}

	
}
