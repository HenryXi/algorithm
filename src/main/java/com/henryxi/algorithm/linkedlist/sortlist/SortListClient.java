package com.henryxi.algorithm.linkedlist.sortlist;

public class SortListClient {
    public static void main(String[] args) {

    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.val > head.next.val) {
            ListNode next = head.next;
            next.next = head;
            head.next = null;
        }
        return head;
    }

    public static ListNode s
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

