package us.inest.app.epi.list;

import us.inest.app.epi.common.ListNode;
import us.inest.app.epi.common.ListUtils;

public class ReverseLinkList {
    
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode p = head;
        ListNode q = head;
        
        while (p != null) {
            q = p.next;
            p.next = prev;
            prev = p;
            p = q;
        }
        
        return prev;
    }

    public static void main(String[] args) {
        ListNode l = ListUtils.init(new int[] {1, 3, 5, 7});
        
        ListNode r = reverseList(l);
        ListUtils.print(r); // 7, 5, 3, 1

    }

}
