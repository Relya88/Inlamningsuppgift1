package InlamningsuppgiftAyler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCase {

    //Programmet ska ha minst 3 testfall som skiljer sig märkvärt åt och testar olika delar av programmet.

    //Testfall 1 som kontrollerar antal tecken
    @Test
    public void testaAntalTecken() {

        WordCalculator wC = new WordCalculator();
        wC.addWord("Christmas");
        wC.addWord("time");
        assertEquals(13,wC.getCharCalc());
    }

    //Testfall 2 - Kontrollerar vad längsta ordet är.
    @Test
    public void testaLangstaOrdet() {

        WordCalculator wC = new WordCalculator();
        wC.addWord("I need to go shopping gifts");
        assertEquals("shopping", wC.getlongestWord());
    }

    //Testfall 3 - true/false om ordet stopp fungerar rätt.
    @Test
    public void testAvStopp() {

        WordCalculator wC = new WordCalculator();
        boolean resultContinue = wC.stoppkontroll("Fortsätt");
        boolean resultStop = wC.stoppkontroll("stop");

        assertEquals(true, resultStop, "Stop retunerar true");

        assertEquals(false, resultContinue, "Andra ord/text än stop returnerar false");
    }

}
