package com.henryxi.algorithm.linkedlist.removenthnode;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndOfListClient {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
//        l.next.next = new ListNode(3);
//        l.next.next.next = new ListNode(4);
//        l.next.next.next.next = new ListNode(5);
        removeNthFromEnd(l, 2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cursor1 = head;
        ListNode cursor2 = head;
        for (int i = 0; i < n; i++) {
            cursor1 = cursor1.next;
        }
        if(cursor1==null){
            return cursor2.next;
        }
        while (cursor1.next != null) {
            cursor2=cursor2.next;
            cursor1=cursor1.next;
        }
        cursor2.next=cursor2.next.next;

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
