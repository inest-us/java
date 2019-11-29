package us.inest.app.dp.factorymethod;

import org.junit.Test;
import static org.junit.Assert.*;

public class NameFactoryTest {

    @Test
    public void testFirstFirst() {
        NameFactory nfactory = new NameFactory();
        // send the text to the factory and get a class back
        Namer namer = nfactory.getNamer("Adam Smith");

        // compute the first and last names
        // using the returned class
        assertTrue(namer instanceof FirstFirst);
        assertEquals("Adam", namer.getFirst());
        assertEquals("Smith", namer.getLast());
    }

    @Test
    public void testLastFirst() {
        NameFactory nfactory = new NameFactory();
        // send the text to the factory and get a class back
        Namer namer = nfactory.getNamer("Smith, Adam");

        // compute the first and last names
        // using the returned class
        assertTrue(namer instanceof LastFirst);
        assertEquals("Adam", namer.getFirst());
        assertEquals("Smith", namer.getLast());
    }

}

