package com.henryxi.algorithm.linkedlist.convertbinarynumberinalinkedlisttointeger;

public class ConvertBinaryNumberInALinkedListToIntegerClient {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(0);
        listNode.next.next = new ListNode(1);
        int decimalValue = getDecimalValue(listNode);
        System.out.println(decimalValue);
    }

    public static int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }
        int res = 0;
        while (head != null) {
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
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
