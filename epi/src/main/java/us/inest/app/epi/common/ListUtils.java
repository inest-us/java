package us.inest.app.epi.common;

import java.util.*;

public class ListUtils {
    public static ListNode searchList(ListNode head, int key) {
        while (head != null && head.data != key) {
            head = head.next;
        }
        return head;
    }

    public static ListNode init(int[] arr) {
        ListNode dummyHead = new ListNode(0, null);
        for (int i = 0; i < arr.length; i++) {
            insertLast(dummyHead, arr[i]);
        }
        return dummyHead.next;
    }

    public static void insertLast(ListNode head, int data) {
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        ListNode newNode = new ListNode(data, null);
        last.next = newNode;
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

    public static void print(List<String> list) {
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    public static void print(ListNode head) {
        if (head == null) {
            return;
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
