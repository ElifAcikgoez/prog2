package uebung06;

public class Kreis extends GeometrischeFigur implements Vergleichbar
{
	private double radius;

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public Kreis(Farbe farbe, double radius)
	{
		super(farbe);
		this.radius = radius;
	}

	@Override
	double berechneFlaeche()
	{
		// A=π·r2
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	double berechneUmfang()
	{
		// U=2·π·r
		return 2*Math.PI*radius;
	}

	@Override
	public boolean hatGroessereFlaecheAls(GeometrischeFigur a)
	{
		if( this.berechneFlaeche()>a.berechneFlaeche())
		{
			return true;
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
		if ( a.getFarbe() == getFarbe())
		{
			return true;
		}
		return false;
	}
	
	
}
