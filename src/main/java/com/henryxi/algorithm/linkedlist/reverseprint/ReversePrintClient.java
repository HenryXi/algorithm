package com.henryxi.algorithm.linkedlist.reverseprint;

import java.util.Arrays;

public class ReversePrintClient {
    public static void main(String[] args) {
        ReversePrintClient client = new ReversePrintClient();
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        System.out.println(Arrays.toString(client.reversePrint(head)));
    }

    public int[] reversePrint(ListNode head) {
        ListNode p = head;
        int count = 0;
        while (p != null) {
            p = p.next;
            count++;
        }
        int[] res = new int[count];
        int index = res.length - 1;
        while (head != null) {
            res[index] = head.val;
            head = head.next;
            index--;
        }
        return res;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

