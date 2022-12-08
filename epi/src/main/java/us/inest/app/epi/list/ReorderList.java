package us.inest.app.epi.list;

import us.inest.app.epi.common.ListNode;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        
        // find the middle node
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reverse the second part of the list
        ListNode prev = null;
        ListNode curr = slow;
        ListNode tmp;
        while (curr != null) {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        
        // Merge 2 list
        ListNode first = head;
        ListNode second = prev;
        while (second.next != null) {
            tmp = first.next;
            first.next = second;
            first = tmp;
            
            tmp = second.next;
            second.next = first;
            second = tmp;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
