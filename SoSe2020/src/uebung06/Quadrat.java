package uebung06;

public class Quadrat extends Viereck implements Vergleichbar
{

	public Quadrat(Farbe farbe, double laenge)
	{
		super(farbe,laenge, laenge );
		
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
		if ( getFarbe()== a.getFarbe())
		{
			return true;
		}
		return false;
	}
	
	

}
