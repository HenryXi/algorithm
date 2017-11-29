package com.henryxi.algorithm.linkedlist.findlast;

/**
 * linked list length is l
 * 1->2->3->4->5->6
 * find the last n(0<n<=l) node value
 */
public class FindLastNNode {

    public static void main(String[] args) {
        int l = 10;
        int n = 6;
        LinkedList linkedList = new LinkedList();
        linkedList.init(l);
        System.out.println("linked list:" + linkedList);
        Node target = findLastN(linkedList, n);
        System.out.println("the " + n + " node from end:" + target.data);
    }

    private static Node findLastN(LinkedList linkedList, int n) {
        if (linkedList == null || n < 1) {
            return null;
        }
        Node pointer1 = linkedList.head;
        for (int i = 0; i < n; i++) {
            pointer1 = pointer1.next;
        }
        Node pointer2 = linkedList.head;
        while (true) {
            if (pointer1 == null) {
                return pointer2;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
    }
}
