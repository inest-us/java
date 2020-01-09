package us.inest.app.dcp.list;

public class AddTwoNumbers {
    public static ListNode add_rec(ListNode l1, ListNode l2) {
        return addHelper(l1, l2, 0);
    }

    private static ListNode addHelper(ListNode l1, ListNode l2, int carry) {
        //base case
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        int value1 = (l1 == null) ? 0 : l1.data;
        int value2 = (l2 == null) ? 0 : l2.data;
        int sum = value1 + value2 + carry;
        int digit = sum % 10;
        carry = sum / 10;
        ListNode node = new ListNode(digit, addHelper(l1 != null ? l1.next: null, l2 != null ? l2.next: null, carry));
        return node;
    }
}
