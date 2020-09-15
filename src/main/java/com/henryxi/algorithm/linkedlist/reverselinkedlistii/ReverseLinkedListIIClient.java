package com.henryxi.algorithm.linkedlist.reverselinkedlistii;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/submissions/
 */
public class ReverseLinkedListIIClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ListNode listNode = reverseBetween(l1, 2, 4);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode pre = fake;
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        for (int i = m; i < n; i++) {
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return fake.next;
    }

    public static ListNode otherReverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }
        head = pre.next;
        for (int i = m; i < n; i++) { //1 2 3 4 5
            ListNode nex = head.next;
            head.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
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
