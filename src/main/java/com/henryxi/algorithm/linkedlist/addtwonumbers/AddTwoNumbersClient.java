package com.henryxi.algorithm.linkedlist.addtwonumbers;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class AddTwoNumbersClient {
    public static void main(String[] args) {
        /**
         * 个位->十位->百位
         * 3 2 8
         * 9 3
         * 2 6 8
         */
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(8);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(3);
        ListNode current = myAddTwoNumbers(l1, l2);
        do {
            System.out.println(current == null ? "null" : current.val);
            if (current == null) {
                break;
            }
            current = current.next;
        } while (true);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return root.next;
    }


    public static ListNode myAddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            int sumVal = l1Val + l2Val + carry;
            cursor.next = new ListNode(sumVal % 10);
            cursor = cursor.next;
            carry = sumVal / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return root.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
