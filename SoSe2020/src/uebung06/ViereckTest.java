package uebung06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class ViereckTest
{


    private Viereck viereck1, viereck2, viereck3, viereck4, viereck5;


    @BeforeEach
    void setUp() {
        viereck1 = new Viereck(Farbe.ROT, 2.0, 4.0);
        viereck2 = new Viereck(Farbe.GRUEN, 3.5, 2.3);
        viereck3 = new Viereck(Farbe.SCHWARZ, 7.0, 17.5);
        viereck4 = new Viereck(Farbe.GELB, 4, 1);
        viereck5 = new Viereck(Farbe.ROT, 2.0, 4.0);
    }

    @Test
  public  void berechneFlaeche() {
        double expectedFlaeche = 8.0;
        double actualFlaeche = viereck1.berechneFlaeche();
        assertTrue(expectedFlaeche == actualFlaeche, "Die Fläche sollte " + expectedFlaeche + " sein, ist aber " + actualFlaeche);

        expectedFlaeche = 3.5 * 2.3;
        actualFlaeche = viereck2.berechneFlaeche();
        assertTrue(expectedFlaeche == actualFlaeche, "Die Fläche sollte " + expectedFlaeche + " sein, ist aber " + actualFlaeche);
    }

    @Test
  public  void berechneUmfang() {
        double expectedUmfang = 2*7 + 2*17.5;
        double actualUmfang = viereck3.berechneUmfang();
        assertEquals(expectedUmfang, actualUmfang, "Der Umfang sollte " + expectedUmfang + " sein, ist aber " + actualUmfang);

        expectedUmfang = 10;
        actualUmfang = viereck4.berechneUmfang();
        assertEquals(expectedUmfang, actualUmfang, "Der Umfang sollte " + expectedUmfang + " sein, ist aber " + actualUmfang);
    }

    @Test
   public void testEquals() {
        assertEquals(viereck1, viereck5, "Viereck1: Breite = " + viereck1.getBreite()+
                ", Hoehe = " + viereck1.getHoehe() + ", Farbe = " + viereck1.getFarbe() +
                "; Viereck5: Breite= " + viereck5.getBreite() + ", Hoehe = " + viereck5.getHoehe() +
                ", Farbe = " + viereck5.getFarbe() + " -> die Vierecke müssen gleich sein.");

        assertFalse(viereck1.equals(viereck2), "Viereck 1 und 2 sind nicht gleich");
    }

    @Test
   public  void testHashcode() {
        assertTrue(viereck1.equals(viereck5) && viereck5.equals(viereck1), "Viereck1 muss gleich Viereck5 sein und Viereck5 muss gleich Viereck1 sein.");
        assertTrue(viereck1.hashCode() == viereck5.hashCode(), "Der hashCode von zwei gleichen Objekten muss derselbe sein.");
    }
	
}
