package us.inest.epi.common;

public class ListUtils {
    public static ListNode searchList(ListNode head, int key) {
        while (head != null && head.data != key) {
            head = head.next;
        }
        return head;
    }

    public static void insertAfter(ListNode node, ListNode newNode) {
        newNode.next = node.next;
        node.next = newNode;
    }

    public static void deleteList(ListNode aNode) {
        aNode.next = aNode.next.next;
    }

    public static int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
