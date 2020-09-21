package com.henryxi.algorithm.linkedlist.deletenodeinalinkedlist;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeInALinkedListClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(1);
        l1.next.next.next = new ListNode(9);
        deleteNode(l1.next);
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    public static void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

