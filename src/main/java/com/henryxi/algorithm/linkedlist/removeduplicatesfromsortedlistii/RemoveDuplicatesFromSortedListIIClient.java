package com.henryxi.algorithm.linkedlist.removeduplicatesfromsortedlistii;

public class RemoveDuplicatesFromSortedListIIClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(5);
        ListNode listNode = deleteDuplicates(l1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode pre = fake;
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val != current.next.val) {
                if (pre.next != current) {
                    pre.next = current.next;
                } else {
                    pre = pre.next;
                }
            }
            current = current.next;
        }
        if (pre.next != current) {
            pre.next = null;
        }
        return fake.next;
    }

    public ListNode otherDeleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy, cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val != cur.next.val) {
                if (pre.next != cur) {
                    pre.next = cur.next;
                } else {
                    pre = pre.next;
                }
            }
            cur = cur.next;
        }
        if (pre.next != cur) {
            pre.next = cur.next;
        }
        return dummy.next;
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