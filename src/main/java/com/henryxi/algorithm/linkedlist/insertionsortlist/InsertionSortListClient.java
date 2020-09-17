package com.henryxi.algorithm.linkedlist.insertionsortlist;

public class InsertionSortListClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(1);
        l1.next.next.next = new ListNode(3);
        ListNode listNode = insertionSortList(l1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode insertionSortList(ListNode head) {
        ListNode curr = head;
        ListNode sortedListNode = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = null;
            sortedListNode = insert(sortedListNode, curr);
            curr = next;
        }
        return sortedListNode;
    }

    private static ListNode insert(ListNode sortedListNode, ListNode listNode) {
        if (sortedListNode == null) {
            return listNode;
        }
        ListNode curr = sortedListNode;
        ListNode pre = null;
        while (curr != null) {
            int curVal = curr.val;
            int preVal = pre == null ? Integer.MIN_VALUE : pre.val;
            if (listNode.val > curVal) {
                pre = curr;
                curr = curr.next;
                continue;
            }
            if (listNode.val < preVal) {
                listNode.next = sortedListNode;
                return listNode;
            }
            listNode.next = curr;
            if (pre == null) {
                return listNode;
            }
            pre.next = listNode;
            return sortedListNode;
        }
        pre.next = listNode;
        return sortedListNode;
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


