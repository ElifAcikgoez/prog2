package uebung06;

public abstract class GeometrischeFigur 
{
private Farbe farbe;

public Farbe getFarbe()
{
	return farbe;
}


public void setFarbe(Farbe farbe)
{
	this.farbe = farbe;
}


public GeometrischeFigur(Farbe farbe)
{
	super();
	this.farbe = farbe;
}


abstract double berechneFlaeche();
abstract double berechneUmfang();



}
