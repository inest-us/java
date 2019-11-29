package us.inest.app.ppj.list;

public class Identification {
    boolean detect_loop(ListNode head) {
        if (head == null) {
            return false; // empty list does not have a loop
        }
        ListNode trailing = head; //slow pointer
        ListNode leading = head; //fast pointer
        while (leading != null) {
            leading = leading.next;
            if (trailing == leading) {
                return true; // detect a loop
            }
            trailing = trailing.next;
            if (leading != null) {
                leading = leading.next;
            }
        }
        return false; // List does not have a loop
    }
}
