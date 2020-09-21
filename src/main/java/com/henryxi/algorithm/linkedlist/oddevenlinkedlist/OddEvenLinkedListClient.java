package com.henryxi.algorithm.linkedlist.oddevenlinkedlist;

public class OddEvenLinkedListClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ListNode listNode = oddEvenList(l1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode l1curr = head;
        ListNode l2head = head.next;
        ListNode l2curr = l2head;
        while (l1curr.next != null && l2curr.next != null) {
            l1curr.next = l2curr.next;
            l1curr = l1curr.next;
            l2curr.next = l1curr.next;
            l2curr = l2curr.next;
        }
        l1curr.next = l2head;
        return head;
    }
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

