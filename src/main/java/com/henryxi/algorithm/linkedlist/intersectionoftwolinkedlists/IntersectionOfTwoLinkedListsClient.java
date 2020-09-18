package com.henryxi.algorithm.linkedlist.intersectionoftwolinkedlists;

public class IntersectionOfTwoLinkedListsClient {
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        ListNode l1 = new ListNode(4);
        l1.next = new ListNode(1);
        l1.next.next = common;
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(0);
        l2.next.next = new ListNode(1);
        l2.next.next.next = common;
        ListNode intersectionNode = bestGetIntersectionNode(l1, l2);
        System.out.println(intersectionNode == null ? "null" : intersectionNode.val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        while (headA != null) {
            ListNode cur = headB;
            while (cur != null) {
                if (headA == cur) {
                    return headA;
                }
                cur = cur.next;
            }
            headA = headA.next;
        }
        return null;
    }

    public static ListNode bestGetIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
