package uebung06;

public class Viereck extends GeometrischeFigur implements Vergleichbar
{
private double breite;
public double getBreite()
{
	return breite;
}
public void setBreite(double breite)
{
	this.breite = breite;
}
public double getHoehe()
{
	return hoehe;
}
public void setHoehe(double hoehe)
{
	this.hoehe = hoehe;
}
private double hoehe;


public Viereck(Farbe farbe, double breite, double hoehe)
{
	super(farbe);
	this.breite = breite;
	this.hoehe = hoehe;
}
@Override
double berechneFlaeche()
{
	
	return breite*hoehe;
}
@Override
double berechneUmfang()
{
	
	return 2*breite + 2*hoehe;
}
@Override
public boolean hatGroessereFlaecheAls(GeometrischeFigur a)
{
	if( this.berechneFlaeche()>a.berechneFlaeche())
	{
		return true;
	}
	if ( this.berechneFlaeche() == a.berechneFlaeche())
	{
		return false;
	}
	
	return false;
}
@Override
public boolean hatGroesserenUmfangAls(GeometrischeFigur a)
{
	if ( this.berechneUmfang()> a.berechneUmfang())
	{
		return true;
	}
	return false;
}
@Override
public boolean hatSelbeFarbeWie(GeometrischeFigur a)
{
	if ( getFarbe() == a.getFarbe())
	{
		return true;
	}
	return false;
}



}
