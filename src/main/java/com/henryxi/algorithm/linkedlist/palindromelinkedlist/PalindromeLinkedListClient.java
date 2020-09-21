package com.henryxi.algorithm.linkedlist.palindromelinkedlist;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedListClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(2);
        l1.next.next.next = new ListNode(1);
        boolean palindrome = isPalindrome(l1);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode left = dummy.next;
        ListNode right = slow.next;
        slow.next = null;
        ListNode reversed = reverse(right);
        while (left != null && reversed != null) {
            if (left.val != reversed.val) {
                return false;
            }
            left = left.next;
            reversed = reversed.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
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
