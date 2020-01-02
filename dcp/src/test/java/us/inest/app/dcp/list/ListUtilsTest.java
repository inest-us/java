package us.inest.app.dcp.list;

import org.junit.Test;
import static org.junit.Assert.*;

public class ListUtilsTest {
    @Test
    public void testInit() {
        ListNode head = ListUtils.init(new int[] { 1, 4, 3, 5, 2, 6 });
        assertEquals(4, head.next.data);
        ListUtils.display(head);
    }
}
