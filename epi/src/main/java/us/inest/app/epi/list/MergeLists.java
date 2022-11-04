package us.inest.app.epi.list;

import us.inest.app.epi.common.ListNode;
import us.inest.app.epi.common.ListUtils;

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
            current = current.next;
        }
        current.next = L1 != null ? L1 : L2;
        return dummyHead.next;
    }
    
    public static void main(String[] args) {
        ListNode l1 = ListUtils.init(new int[] {1, 3, 5, 7});
        ListNode l2 = ListUtils.init(new int[] {2, 4, 6, 8, 10});
        
        ListNode head = mergeTwoSortedList(l1, l2);
        ListUtils.print(head);
        
        System.out.println(head.data);
    }
}
