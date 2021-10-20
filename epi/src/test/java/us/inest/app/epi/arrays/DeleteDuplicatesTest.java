package us.inest.app.epi.arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class DeleteDuplicatesTest {
    @Test
    public void testdeleteDuplicates() {
        int[] arr = new int[] {1, 2, 2, 3, 3};
        int count = DeleteDuplicates.deleteDuplicates(arr);
        assertEquals(3, count);
    }
}
