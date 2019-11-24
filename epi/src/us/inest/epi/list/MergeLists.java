package us.inest.epi.list;

import us.inest.epi.common.ListNode;

public class MergeLists {

    public static ListNode mergeTwoSortedList(ListNode L1, ListNode L2) {
        ListNode dummyHead = new ListNode(0, null);
        ListNode current = dummyHead;
        while (L1 != null && L2 != null) {
            if (L1.data <= L2.data) {
                current.next = L1;
                L1 = L1.next;
            } else {
                current.next = L2;
                L2 = L2.next;
            }
        }
        current.next = L1 != null ? L1 : L2;
        return dummyHead.next;
    }
}
