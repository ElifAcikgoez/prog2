package uebung06;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class KreisTest
{
	 private Kreis kreis1, kreis2, kreis3, kreis4, kreis5;

	    @BeforeEach
	    void setUp() {
	        kreis1 = new Kreis(Farbe.ROT, 2.0);
	        kreis2 = new Kreis(Farbe.GELB, 4.0);
	        kreis3 = new Kreis(Farbe.BLAU, 1.0);
	        kreis4 = new Kreis(Farbe.GRUEN, 2.5);
	        kreis5 = new Kreis(Farbe.ROT, 2.0);
	    }

	    @Test
	   public void testBerechneFlaeche() {
	        double expectedFlaeche = Math.PI * 2.0 * 2.0;
	        double actualFlaeche = kreis1.berechneFlaeche();
	        assertTrue(expectedFlaeche == actualFlaeche, "Die Fläche sollte " + expectedFlaeche + " sein, ist aber " + actualFlaeche);

	        expectedFlaeche = Math.PI * 2.5 * 2.5;
	        actualFlaeche = kreis4.berechneFlaeche();
	        assertTrue(expectedFlaeche == actualFlaeche, "Die Fläche sollte " + expectedFlaeche + " sein, ist aber " + actualFlaeche);
	    }

	    @Test
	   public void testBerechneUmfang() {
	        double expectedUmfang = 2 * Math.PI * 1;
	        double actualUmfang = kreis3.berechneUmfang();
	        assertEquals(expectedUmfang, actualUmfang, "Der Umfang sollte " + expectedUmfang + " sein, ist aber " + actualUmfang);

	        expectedUmfang = 2 * Math.PI * 2.5;
	        actualUmfang = kreis4.berechneUmfang();
	        assertEquals(expectedUmfang, actualUmfang, "Der Umfang sollte " + expectedUmfang + " sein, ist aber " + actualUmfang);
	    }

	    @Test
	   public void testEquals() {

	        assertEquals(kreis1, kreis5, "Kreis1: Radius = " + kreis1.getRadius() +
	        " , Farbe = " + kreis1.getFarbe() + "; Kreis5: Radius = " + kreis5.getRadius() +
	        " , Farbe = " + kreis5.getFarbe() + " -> die Kreise müssen gleich sein.");

	        assertFalse(kreis1.equals(kreis2), "Kreis 1 und Kreis2 sind nicht gleich");
	    }

	    @Test
	   public void testHashcode() {
	        assertTrue(kreis1.equals(kreis5) && kreis1.equals(kreis5), "Kreis1 muss gleich Kreis5 sein und Kreis5 muss gleich Kreis1 sein.");
	        assertTrue(kreis1.hashCode() == kreis5.hashCode(), "Der hashCode von zwei gleichen Objekten muss derselbe sein.");
	    }
	

}
