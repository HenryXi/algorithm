package com.henryxi.algorithm.linkedlist.copylistwithrandompointer;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 */
public class CopyListWithRandomPointerClient {
    public static void main(String[] args) {
        Node node = new Node(7);
        node.random = null;
        node.next = new Node(13);
        node.next.random = node;
        node.next.next = new Node(11);
        node.next.next.random = node.next.next.next;
        node.next.next.next = new Node(10);
        node.next.next.next.random = node.next.next;
        node.next.next.next.next = new Node(1);
        node.next.next.next.next.random = node;
        Node newNode = copyRandomList(node);
        while (newNode != null) {
            System.out.println(newNode.val + " " + (newNode.random == null ? "null" : newNode.random.val));
            newNode = newNode.next;
        }
    }

    public static Node copyRandomList(Node head) {
        Node cur = head;
        while (cur != null) {
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = cur.next.next;
        }
        cur = head;
        while (cur != null) {
            Node next = cur.next;
            next.random = cur.random == null ? null : cur.random.next;
            cur = cur.next.next;
        }
        cur = head;
        Node fake = new Node(0);
        Node dummy = fake;
        while (cur != null) {
            Node next = cur.next;
            fake.next = next;
            cur.next = next.next;
            cur = cur.next;
            fake = fake.next;
        }
        return dummy.next;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


