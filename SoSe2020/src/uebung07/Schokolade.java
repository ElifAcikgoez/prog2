package uebung07;

public class Schokolade
{
private int stueck;
 
//Setter & Getter
public int getStueck()
{
	return stueck;
}

public void setStueck(int stueck)
{
	this.stueck = stueck;
}


// Konstrucktor
public Schokolade(int stueck)
{
	this.stueck=stueck;
}


public int berechneStueckProPeron(int anzahlpersonen) throws ArithmeticException, NichtGenugSchokoladeException
{
	if ( getStueck() < anzahlpersonen) 
	{
		throw new NichtGenugSchokoladeException();
	}
	return getStueck()/anzahlpersonen;
}




}
