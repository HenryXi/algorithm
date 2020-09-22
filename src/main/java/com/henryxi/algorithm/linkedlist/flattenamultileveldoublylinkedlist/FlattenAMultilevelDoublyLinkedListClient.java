package com.henryxi.algorithm.linkedlist.flattenamultileveldoublylinkedlist;

/**
 * https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
 */
public class FlattenAMultilevelDoublyLinkedListClient {
    public static void main(String[] args) {
        Node node = new Node(0);
    }

    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        while (cur != null) {
            if (cur.child != null) {
                Node next = cur.next;
                cur.next = flatten(cur.child);
                cur.child = null;
                cur.next.prev = cur;
                if (next != null) {
                    while (cur.next != null) {
                        cur = cur.next;
                    }
                    cur.next = next;
                    next.prev = cur;
                }
            }
            cur = cur.next;
        }
        return head;
    }

    public Node otherFlatten(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        while (cur != null) {
            if (cur.child != null) {
                Node next = cur.next;
                Node child = flatten(cur.child);
                cur.next = child;
                child.prev = cur;
                cur.child = null;
                if (next != null) {
                    while (cur.next != null) {
                        cur = cur.next;
                    }
                    cur.next = next;
                    next.prev = cur;
                }
            }
            cur = cur.next;
        }
        return head;
    }
}


class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(int val) {
        this.val = val;
    }
}
