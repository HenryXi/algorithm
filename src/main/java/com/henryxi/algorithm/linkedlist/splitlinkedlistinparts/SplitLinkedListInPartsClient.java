package com.henryxi.algorithm.linkedlist.splitlinkedlistinparts;

public class SplitLinkedListInPartsClient {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next.next = new ListNode(7);
//        listNode.next.next.next.next.next.next.next = new ListNode(8);
//        listNode.next.next.next.next.next.next.next.next = new ListNode(9);
//        listNode.next.next.next.next.next.next.next.next.next = new ListNode(10);
        ListNode[] listNodes = splitListToParts(listNode, 3);
        for (ListNode node : listNodes) {
            ListNode cur = node;
            while (cur != null) {
                System.out.println(cur.val);
                cur = cur.next;
            }
            System.out.println("---------");
        }
    }

    public static ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] listNodes = new ListNode[k];
        ListNode cur = root;
        int length = 0;
        while (cur != null) {
            cur = cur.next;
            length++;
        }
        ListNode pre = new ListNode(0);
        if (k >= length) {
            cur = root;
            for (int i = 0; i < k; i++) {
                listNodes[i] = cur;
                if (cur != null) {
                    pre = cur;
                    cur = cur.next;
                    pre.next = null;
                } else {
                    cur = null;
                }
            }
            return listNodes;
        }
        int subLength = length / k;
        int mod = length % k;
        cur = root;
        for (int i = 0; i < k; i++) {
            listNodes[i] = cur;
            int step = subLength + (mod > 0 ? 1 : 0);
            if (mod > 0) {
                mod--;
            }
            for (int j = 0; j < step; j++) {
                if (cur == null) {
                    return listNodes;
                }
                pre = cur;
                cur = cur.next;
            }
            pre.next = null;
        }
        return listNodes;
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
