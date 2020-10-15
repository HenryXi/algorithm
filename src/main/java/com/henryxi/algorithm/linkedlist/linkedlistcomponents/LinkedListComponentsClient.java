package com.henryxi.algorithm.linkedlist.linkedlistcomponents;

/**
 * https://leetcode.com/problems/linked-list-components/
 */
public class LinkedListComponentsClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
//        l1.next.next.next = new ListNode(3);
        int[] G = new int[]{1, 0};
        System.out.println(numComponents(l1, G));
    }

    public static int numComponents(ListNode head, int[] G) {
        int maxNum = -1;
        for (int num : G) {
            if (num > maxNum) {
                maxNum = num;
            }
        }

        boolean[] arr = new boolean[maxNum + 1];
        for (int num : G) {
            arr[num] = true;
        }
        int componentsNum = 0;
        while (head != null) {
            if (head.next == null) {
                if (exist(head.val, arr)) {
                    componentsNum++;
                }
            } else {
                if (exist(head.val, arr) && !exist(head.next.val, arr)) {
                    componentsNum++;
                }
            }
            head = head.next;
        }
        return componentsNum;
    }

    private static boolean exist(int value, boolean[] arr) {
        if (value >= arr.length) {
            return false;
        }
        return arr[value];
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