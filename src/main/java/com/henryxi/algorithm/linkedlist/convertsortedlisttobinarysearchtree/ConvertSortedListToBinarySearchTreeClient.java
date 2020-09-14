package com.henryxi.algorithm.linkedlist.convertsortedlisttobinarysearchtree;

import java.util.LinkedList;

public class ConvertSortedListToBinarySearchTreeClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(-10);
        l1.next = new ListNode(-3);
        l1.next.next = new ListNode(0);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(9);
        TreeNode treeNode = sortedListToBST(l1);
        printTree(treeNode);
    }

    public static TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode pre = head;
        ListNode mid = pre.next;
        ListNode last = mid.next;
        while (last != null && last.next != null) {
            last = last.next.next;
            mid = mid.next;
            pre = pre.next;
        }
        pre.next = null;

        return new TreeNode(mid.val, sortedListToBST(head), sortedListToBST(mid.next));
    }

    public static void printTree(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.peek();
            System.out.println(current == null ? "null" : current.val);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
            queue.poll();
        }
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


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


