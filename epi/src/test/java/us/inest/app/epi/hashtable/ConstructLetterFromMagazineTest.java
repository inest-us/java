package us.inest.app.epi.hashtable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConstructLetterFromMagazineTest {
    @Test
    public void testIsLetterConstructibleFromMagazine() {
        String letterText = "Thanks";
        String magazineText = "Thanks for your good work";
        boolean result = ConstructLetterFromMagazine.isLetterConstructibleFromMagazine(letterText, magazineText);
        assertTrue(result);
    }
}
