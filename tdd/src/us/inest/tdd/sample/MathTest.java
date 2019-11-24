package us.inest.tdd.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

    @Test
    void test() {
        int a = 2;
        int b = 3;
        int c = a + b;
        assertEquals(5, c);
    }

}
