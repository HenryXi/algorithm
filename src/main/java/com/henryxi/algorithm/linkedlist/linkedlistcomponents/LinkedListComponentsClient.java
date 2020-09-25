package com.henryxi.algorithm.linkedlist.linkedlistcomponents;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/linked-list-components/
 */
public class LinkedListComponentsClient {
    public static void main(String[] args) {
//        int i = 0;
//        System.out.println(++i);
//        System.out.println(i);
        int[] arr = new int[]{8, 3, 6, 9, 2, 1, 7, 89, 3, 2};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public int numComponents(ListNode head, int[] G) {

        sort(G, 0, G.length - 1);
        return 0;
    }

    public static void sort(int[] arr, int begin, int end) {
        if (begin >= end || arr.length <= 1) {
            return;
        }
        int i = begin;
        int j = end;
        int flag = arr[begin];
        while (i)
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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