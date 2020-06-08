package uebung06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class GeometrischeFigurTest
{
	
	
	Kreis kreis1, kreis2, kreis3, kreis4, kreis5;
    Viereck viereck1, viereck2, viereck3;
    Quadrat quadrat1, quadrat2, quadrat3;
    
  
    @BeforeEach
   
    void setUp() {
     kreis1 =   new Kreis(Farbe.ROT, 2.0);
      kreis2 = new Kreis(Farbe.GELB, 4.0);
      kreis3 = new Kreis(Farbe.BLAU, 1.0);
     kreis4=  new Kreis(Farbe.GRUEN, 2.5);
      kreis5 = new Kreis(Farbe.ROT, 2.0);
     viereck1=  new Viereck(Farbe.ROT, 2.0, 4.0);
      viereck2= new Viereck(Farbe.GRUEN, 3.5, 2.3);
     viereck3 =   new Viereck(Farbe.ROT, 2.0, 4.0);
      quadrat1 = new Quadrat(Farbe.GRUEN, 3);
      quadrat2 =  new Quadrat(Farbe.SCHWARZ, 3.4);
      quadrat3  = new Quadrat(Farbe.GRUEN, 3);
    }
  
    

    
    @Test
    void testHatGroessereFlaecheAls() {
        assertTrue(kreis2.hatGroessereFlaecheAls(kreis1), "Fläche Kreis2 = " + kreis2.berechneFlaeche() + " sollte größer" +
                "als Fläche Kreis1 = " + kreis1.berechneFlaeche() + " sein." );
        assertFalse(kreis1.hatGroessereFlaecheAls(kreis2), "Fläche Kreis1 = " + kreis1.berechneFlaeche() + " sollte nicht größer" +
                "als Fläche Kreis2 = " + kreis2.berechneFlaeche() + " sein." );
        assertFalse(kreis1.hatGroessereFlaecheAls(kreis5), "Fläche Kreis1 = " + kreis1.berechneFlaeche() + " ist genauso groß" +
                " wie Fläche Kreis5 = " + kreis5.berechneFlaeche() + " - nicht größer." );
        assertTrue(quadrat1.hatGroessereFlaecheAls(viereck1), "Fläche Quadrat1 = " + quadrat1.berechneFlaeche() + " sollte größer" +
                " sein als Fläche Viereck1 =  " + viereck1.berechneFlaeche());

        double flaecheKreis = kreis1.berechneFlaeche();
        double flaecheViereck = viereck1.berechneFlaeche();
        boolean kreisIstGroesserAlsViereck = flaecheKreis > flaecheViereck;
        assertEquals(kreisIstGroesserAlsViereck, kreis1.hatGroessereFlaecheAls(viereck1), "kreis1.hatGroessereFlaecheAls(viereck1) sollte " +
                kreisIstGroesserAlsViereck + " ergeben.");
    }
    
    @Test
    void testHatGroesserenUmfangAls() {
        assertTrue(kreis2.hatGroesserenUmfangAls(kreis1), "Fläche Kreis2 = " + kreis2.berechneUmfang() + " sollte größer" +
                " als Fläche Kreis1 = " + kreis1.berechneUmfang() + " sein." );
        assertFalse(kreis1.hatGroessereFlaecheAls(kreis2), "Fläche Kreis1 = " + kreis1.berechneUmfang() + " sollte nicht " +
                "größer als Fläche Kreis2 = " + kreis2.berechneUmfang() + " sein." );
        assertFalse(kreis1.hatGroessereFlaecheAls(kreis5), "Fläche Kreis1 = " + kreis1.berechneUmfang() + " ist genauso groß " +
                "wie Fläche Kreis5 = " + kreis5.berechneUmfang() + " - nicht größer." );

        double umfangKreis = kreis4.berechneUmfang();
        double umfangQuadrat = quadrat2.berechneUmfang();
        boolean kreisHatGroesserenUmfangAlsViereck = umfangKreis > umfangQuadrat;
        assertEquals(kreisHatGroesserenUmfangAlsViereck, kreis4.hatGroesserenUmfangAls(quadrat2), "kreis4.hatGroessereFlaecheAls(quadrat2) sollte " +
                kreisHatGroesserenUmfangAlsViereck + " ergeben.");
    }

    @Test
    void testHatSelbeFarbe() {
        assertTrue(kreis1.hatSelbeFarbeWie(kreis5), "Farbe Kreis1 = " + kreis1.getFarbe() + ", Farbe Kreis5 = " + kreis5.getFarbe()+ ". Sollte gleich sein.");
        assertTrue(kreis1.hatSelbeFarbeWie(viereck1), "Farbe Kreis1 = " + kreis1.getFarbe() + ", Farbe Viereck1 = " + viereck1.getFarbe()+ ". Sollte gleich sei");
        assertTrue(kreis4.hatSelbeFarbeWie(quadrat1), "Farbe Kreis4 = " + kreis4.getFarbe() + ", Farbe Quadarat1 = " + quadrat1.getFarbe()+ ". Sollte gleich sei");
        assertFalse(kreis2.hatSelbeFarbeWie(viereck1), "Farbe Kreis2 = " + kreis2.getFarbe() + ", Farbe Viereck1 = " + viereck1.getFarbe()+ ". Sollte gleich sei");
    }
    

}
