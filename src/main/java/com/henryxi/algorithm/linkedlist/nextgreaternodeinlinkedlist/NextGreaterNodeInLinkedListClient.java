package com.henryxi.algorithm.linkedlist.nextgreaternodeinlinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class NextGreaterNodeInLinkedListClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(7);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(1);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(2);
        l1.next.next.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next.next.next = new ListNode(1);
        System.out.println(Arrays.toString(nextLargerNodes(l1)));
    }

    public static int[] nextLargerNodes(ListNode head) {
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        ListNode newListNode = reverse(head);
        int[] ans = new int[size];
        int largeNum = -1;
        int preValue = -1;
        for (int i = size - 1; i >= 0; i--) {
            int curValue = newListNode.val;
            int max = Math.max(preValue,largeNum);
            int min = Math.min(preValue,largeNum);
            if (i == size - 1) {
                ans[i] = 0;
                largeNum = curValue;
                preValue = curValue;
                newListNode = newListNode.next;
                continue;
            }
            if (curValue > max) {
                ans[i] = 0;
                largeNum = max;
                preValue = curValue;
                newListNode = newListNode.next;
                continue;
            }
            if (curValue < min) {
                ans[i] = largeNum;
                largeNum = ans[i];
                preValue = curValue;
                continue;
            }
            not finish(need implement stack function)
        }
        return ans;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static int[] otherNextLargerNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= list.get(i)) {
                stack.pop();
            }
            ans[i] = stack.empty() ? 0 : stack.peek();
            stack.push(list.get(i));
        }
        return ans;

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

