package uebung07;

public class EnumMain
{

	public static void main(String[] args)
	{
		Monat[] monate = Monat.values(); 
		
		
		
		for (Monat monat :monate)
		{
			monat.setAnzahlTage();
			monat.setJahreszeit();
			
			System.out.println(monat.name() + " hat " + monat.getAnzahlTage()) ;
					if (monat.in(Jahreszeit.WINTER))
			{
			System.out.println("Dieser Monat ist im Winter."); 
			}
			if (monat.in(Jahreszeit.HERBST)) { System.out.println("Dieser Monat ist im Herbst.");
			}
			if (monat.in(Jahreszeit.SOMMER))
			{
			System.out.println("Dieser Monat ist im Sommer.");
			}
			if (monat.in(Jahreszeit.FRUEHLING)) { System.out.println("Dieser Monat ist im Frühling.");
			}
			}
	}

}
