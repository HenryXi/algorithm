package com.henryxi.algorithm.linkedlist.getkthfromend;

public class GetKthFromEndClient {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        GetKthFromEndClient client = new GetKthFromEndClient();
        System.out.println(client.getKthFromEnd(head, 3).val);
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k < 1) {
            return null;
        }
        ListNode pointer1 = head;
        for (int i = 0; i < k; i++) {
            pointer1 = pointer1.next;
        }
        ListNode pointer2 = head;
        while (true) {
            if (pointer1 == null) {
                return pointer2;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

