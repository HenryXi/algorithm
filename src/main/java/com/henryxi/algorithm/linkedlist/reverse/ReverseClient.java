package com.henryxi.algorithm.linkedlist.reverse;


public class ReverseClient {
    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        print(node2);
        Node reverseNode = reverse(node2);
        print(reverseNode);
    }

    private static Node reverse(Node head) {
        System.out.println();
        if (head == null) {
            return head;
        }
        Node pre = head;
        Node current = head.next;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        head.next=null;
        head=pre;
        return head;
    }

    private static void print(Node node) {
        while (node != null) {
            if (node.next == null) {
                System.out.print(node.data);
            } else {
                System.out.print(node.data + " -> ");
            }
            node = node.next;
        }
    }
}
