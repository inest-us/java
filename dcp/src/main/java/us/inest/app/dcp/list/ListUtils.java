package us.inest.app.dcp.list;

public class ListUtils {
    public static ListNode init(int[] arr) {
        ListNode head = null;
        ListNode tail = null;
        for (int item : arr) {
            ListNode newNode = new ListNode(item);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
