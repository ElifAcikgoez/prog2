package uebung06;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class QuadratTest
{
	Quadrat quadrat1, quadrat2, quadrat3;

    @BeforeEach
    void setUp() {
        quadrat1 = new Quadrat(Farbe.GELB, 3);
        quadrat2 = new Quadrat(Farbe.SCHWARZ, 7.5);
        quadrat3 = new Quadrat(Farbe.GELB, 3);
    }

    @Test
    void testConstructor() {
        assertTrue(quadrat1.getBreite() == 3.0, "Breite des " +
                "Quadrats sollte 3 sein, ist aber " + quadrat1.getBreite());

        assertTrue(quadrat1.getHoehe() == 3.0, "Hoehe des " +
                "Quadrats sollte 3 sein, ist aber " + quadrat1.getHoehe());

        assertTrue(quadrat2.getBreite() == 7.5, "Breite des " +
                "Quadrats sollte 7.5 sein, ist aber " + quadrat2.getBreite());

        assertTrue(quadrat2.getHoehe() == 7.5, "Hoehe des " +
                "Quadrats sollte 7.5 sein, ist aber " + quadrat2.getHoehe());

        assertEquals(quadrat3.getFarbe(), Farbe.GELB, "Farbe sollte GELB sein, " +
                "ist aber " + quadrat3.getFarbe());
    }

    @Test
    void testEquals() {
        assertEquals(quadrat1, quadrat3, "Quadrat1: Breite = " + quadrat1.getBreite()+
                ", Hoehe = " + quadrat1.getHoehe() + ", Farbe = " + quadrat1.getFarbe() +
                "; Quadrat3: Breite= " + quadrat3.getBreite() + ", Hoehe = " + quadrat3.getHoehe() +
                ", Farbe = " + quadrat3.getFarbe() + " -> die Quadrate müssen gleich sein.");

        assertFalse(quadrat1.equals(quadrat2), "Quadrat1 und 2 sind nicht gleich");
    }

    @Test
    void testHashcode() {
        assertTrue(quadrat1.equals(quadrat3) && quadrat3.equals(quadrat1), "Quadrat1 muss gleich Quadrat3 sein und Quadrat3 muss gleich Quadrat1 sein.");
        assertTrue(quadrat1.hashCode() == quadrat3.hashCode(), "Der hashCode von zwei gleichen Objekten muss derselbe sein.");
    }
}
