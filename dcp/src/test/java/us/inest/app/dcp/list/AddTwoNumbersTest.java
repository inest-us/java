package us.inest.app.dcp.list;

import org.junit.Test;

public class AddTwoNumbersTest {
    @Test
    public void testAdd_Rec() {
        ListNode l1 = ListUtils.init(new int[] { 3, 2, 1 });
        ListUtils.display(l1);
        
        ListNode l2 = ListUtils.init(new int[] { 9, 7, 8 });
        ListUtils.display(l2);
        
        ListNode sum = AddTwoNumbers.add_rec(l1, l2);
        ListUtils.display(sum);
    }
}
