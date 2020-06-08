package uebung07;

@SuppressWarnings("serial")
public class NichtGenugSchokoladeException extends Exception
{
public NichtGenugSchokoladeException( String s)
{
	super(s);
}

public NichtGenugSchokoladeException()
{
	super("Anzahl der Personen = anzahlPersonen, Stückchen Schokolade = stueck – Es gibt nicht genügend Stückchen Schokolade“");
}
}
