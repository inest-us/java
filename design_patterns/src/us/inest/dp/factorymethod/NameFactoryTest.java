package us.inest.dp.factorymethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NameFactoryTest {

    @Test
    void testFirstFirst() {
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
    void testLastFirst() {
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
