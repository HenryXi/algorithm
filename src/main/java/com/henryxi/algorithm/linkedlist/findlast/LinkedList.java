package com.henryxi.algorithm.linkedlist.findlast;

import java.util.Random;

public class LinkedList {
    public Node head;
    public Node current;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            current = head;
        } else {
            current.next = new Node(data);
            current = current.next;
        }
    }

    public Node init(int length) {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            this.add(random.nextInt(100));
        }
        return head;
    }

    public int length(Node head) {
        if (head == null) {
            return -1;
        }

        int length = 0;
        current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }

    @Override
    public String toString() {
        if (this.head == null) {
            return "null";
        }
        current = this.head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            if (sb.length() != 0) {
                sb.append("->");
            }
            sb.append(current.data);
            current = current.next;
        }
        return sb.toString();
    }
}
