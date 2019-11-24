package us.inest.dcp.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShuffleDeckTest {

    @Test
    void testShuffleDeck() {
        int[] arr = new int[] { 1, 4, 3, 2, 5 };
        arr = ShuffleDeck.shuffle(arr);
        assertNotNull(arr);
    }

}
