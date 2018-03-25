package c02;

public class Identification {
	
	boolean detect_loop(Node head) {
		if (head == null) {
			return false; //empty list does not have a loop
		}
		Node trailing = head;
		Node leading = head;
		while (leading != null) {
			leading = leading.next;
			if (trailing == leading) {
				return true; //detect a loop
			}
			trailing = trailing.next;
			if (leading != null) {
				leading = leading.next;
			}
		}
		return false; //List does not have a loop
	}
}
