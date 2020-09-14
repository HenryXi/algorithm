package com.henryxi.algorithm.linkedlist.rotatelist;

public class RotateListClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ListNode listNode = rotateRight(l1, 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        int count = 0;
        ListNode cursor = head;
        while (cursor != null) {
            count++;
            cursor = cursor.next;
        }
        k = k% count  ;
        if(k==0){
            return head;
        }
        cursor = head;
        ListNode cursor2 = head;
        for (int i = 0; i < k; i++) {
            cursor=cursor.next;
        }
        while (cursor.next!=null){
            cursor=cursor.next;
            cursor2=cursor2.next;
        }
        ListNode newHead = cursor2.next;
        cursor2.next=null;
        cursor.next=head;
        return newHead;
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
