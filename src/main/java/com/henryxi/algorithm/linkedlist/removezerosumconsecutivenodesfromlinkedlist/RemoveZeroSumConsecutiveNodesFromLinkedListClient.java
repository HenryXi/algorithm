package com.henryxi.algorithm.linkedlist.removezerosumconsecutivenodesfromlinkedlist;

public class RemoveZeroSumConsecutiveNodesFromLinkedListClient {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(-3);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(1);
        ListNode newList = removeZeroSumSublists(list);
        while (newList != null) {
            System.out.println(newList.val);
            newList = newList.next;
        }
    }
not finish(how to cut sub list?)
    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        dummy.next = head;
        while (pre != null) {
            ListNode cur = head;
            int sum = 0;
            while (cur != null) {
                sum = sum + cur.val;
                cur = cur.next;
                if (sum == 0) {
                    pre.next = cur;
                    break;
                }
            }
            if (cur == null) {
                pre = pre.next;
            }
        }
        return dummy.next;
    }

    public ListNode otherRemoveZeroSumSublist(ListNode head) {
        ListNode p = new ListNode(0);
        ListNode pre = p;
        p.next = head;
        while (p != null) {
            ListNode cur = p.next;
            int sum = 0;
            while (cur != null) {
                sum += cur.val;
                cur = cur.next;
                if (sum == 0) {
                    p.next = cur;
                    break;
                }
            }
            if (cur == null) p = p.next;
        }
        return pre.next;
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