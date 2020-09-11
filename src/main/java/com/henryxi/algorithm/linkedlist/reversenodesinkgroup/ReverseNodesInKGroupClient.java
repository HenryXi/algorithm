package com.henryxi.algorithm.linkedlist.reversenodesinkgroup;

/**
 * https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 */
public class ReverseNodesInKGroupClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);
        l1.next.next.next.next.next.next = new ListNode(7);
        ListNode listNode = reverseKGroup(l1, 3);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode next;
        dummy.next = head;
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        for (int i = 0; i < length / k; i++) {
            for (int j = 0; j < k - 1; j++) {
                next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev = curr;
            curr = prev.next;
        }
        return dummy.next;
    }

//    public static ListNode myReverseKGroup(ListNode head, int k) {
//
//    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
