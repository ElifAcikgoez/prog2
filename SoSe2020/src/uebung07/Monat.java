package uebung07;

public enum Monat{
	JAN, FEB, MRZ, APRL, MAI, JNY, JLY , AUG , SEP,OKT,NOV,DEZ;
	
Monat(int anzahlTage, Jahreszeit jahreszeit)
{
this.anzahlTage= anzahlTage;

this.jahreszeit = jahreszeit;
}





private int anzahlTage;

public void setAnzahlTage()
{
	
	
	Monat.JAN.anzahlTage = 31;
	Monat.FEB.anzahlTage = 28;
	Monat.MRZ.anzahlTage = 31;
	Monat.APRL.anzahlTage = 30;
	Monat.MAI.anzahlTage = 31;
	Monat.JNY.anzahlTage = 30;
	Monat.JLY.anzahlTage = 31;
	Monat.AUG.anzahlTage = 31;
	Monat.SEP.anzahlTage = 30;
	Monat.OKT.anzahlTage = 31;
	Monat.NOV.anzahlTage = 30;
	Monat.DEZ.anzahlTage = 31;
}


public void setJahreszeit()
{
	
	Monat.JAN.jahreszeit = Jahreszeit.WINTER;
	Monat.FEB.jahreszeit = Jahreszeit.WINTER;
	Monat.MRZ.jahreszeit = Jahreszeit.FRUEHLING;
	Monat.APRL.jahreszeit = Jahreszeit.FRUEHLING;
	Monat.MAI.jahreszeit = Jahreszeit.FRUEHLING;
	Monat.JNY.jahreszeit = Jahreszeit.SOMMER;
	Monat.JLY.jahreszeit = Jahreszeit.SOMMER;
	Monat.AUG.jahreszeit = Jahreszeit.SOMMER;
	Monat.SEP.jahreszeit = Jahreszeit.HERBST;
	Monat.OKT.jahreszeit = Jahreszeit.HERBST;
	Monat.NOV.jahreszeit = Jahreszeit.HERBST;
	Monat.DEZ.jahreszeit = Jahreszeit.WINTER;
}

public int getAnzahlTage()
{
	return anzahlTage;
}
Jahreszeit jahreszeit;




public boolean in(Jahreszeit jahreszeit)
{
	

	
	if (this.jahreszeit == jahreszeit)
	{
		return true;
	}


	return false; 
	
}	



Monat()
{
	
}



}




