package us.inest.app.dcp.list;

class HeadAndTail {
    public ListNode head;
    public ListNode tail;

    public HeadAndTail(ListNode head, ListNode tail) {
        this.head = head;
        this.tail = tail;
    }
}

public class ReverseList {

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    /*
     * using recursive
     */
    public static ListNode reverse_rec(ListNode head) {
        return reverseHelper(head).head;
    }

    public static HeadAndTail reverseHelper(ListNode node) {
        // base cases
        if (node == null) {
            return new HeadAndTail(null, null);
        }
        if (node.next == null) {
            return new HeadAndTail(node, node);
        }

        // recursive call
        HeadAndTail headAndTail = reverseHelper(node.next);
        node.next = null;
        headAndTail.tail.next = node;
        return new HeadAndTail(headAndTail.head, node);
    }
}
