package com.henryxi.algorithm.linkedlist.partitionlist;

public class PartitionListClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(2);
        ListNode listNode = partition(l1, 3);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallTail = small;
        ListNode bigger = new ListNode(0);
        ListNode biggerTail = bigger;
        while (head != null) {
            if (head.val < x) {
                smallTail.next = head;
                head = head.next;
                smallTail = smallTail.next;
                smallTail.next = null;
            } else {
                biggerTail.next = head;
                head = head.next;
                biggerTail = biggerTail.next;
                biggerTail.next = null;
            }

        }
        smallTail.next = bigger.next;
        return small.next;
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
