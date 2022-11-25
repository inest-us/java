package us.inest.app.epi.list;

import us.inest.app.epi.common.ListNode;

public class RevertSubList {
    
    public static ListNode reverseSubList(ListNode head, int start, int finish) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode sublistHead = dummyHead;
        int k = 1;
        while (k < start) {
            k++;
            sublistHead = sublistHead.next;
        }
        
        ListNode p = sublistHead.next;
        ListNode q = null;
        while (k < finish) {
            q = p.next;
            p.next = sublistHead;
            sublistHead = p;
            p = q;
            k++;
        }
        
        return dummyHead.next;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
