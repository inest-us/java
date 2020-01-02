package us.inest.app.dcp.list;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseListTest {
    @Test
    public void testReverse() {
        ListNode head = ListUtils.init(new int[] { 1, 4, 3, 6, 2, 5 });
        ListUtils.display(head);

        head = ReverseList.reverse(head);
        ListUtils.display(head);

        assertEquals(5, head.data);
    }

    @Test
    public void testReverseRec() {
        ListNode head = ListUtils.init(new int[] { 1, 4, 3, 6, 2, 5 });
        ListUtils.display(head);

        head = ReverseList.reverse_rec(head);
        ListUtils.display(head);

        assertEquals(5, head.data);
    }
}
