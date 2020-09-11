package com.henryxi.algorithm.linkedlist.swapnodesinpairs;

public class SwapNodesInPairsClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(5);
        ListNode listNode = swapPairs(l1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cursor = head.next;
        head.next = swapPairs(cursor.next);
        cursor.next = head;
        return cursor;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
