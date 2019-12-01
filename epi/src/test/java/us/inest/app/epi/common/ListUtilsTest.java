package us.inest.app.epi.common;

import org.junit.Test;
import static org.junit.Assert.*;

public class ListUtilsTest {
    @Test
    public void testBasicListOperations() {
        ListNode head = ListUtils.init(new int[] {1, 2, 3, 4, 5});
        int size = ListUtils.length(head);
        assertEquals(5, size);
    }
}
