package com.henryxi.algorithm.linkedlist.linkedlistinbinarytree;

public class LinkedListInBinaryTreeClient {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(8);
        TreeNode treeNode = new TreeNode(1, new TreeNode(4, null, new TreeNode(2, new TreeNode(1), null)), new TreeNode(4, new TreeNode(2, new TreeNode(6), new TreeNode(8, new TreeNode(1), new TreeNode(3))), null));
        System.out.println(isSubPath(listNode, treeNode));
    }

    public static boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        return isSubPathFromRoot(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private static boolean isSubPathFromRoot(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (head.val != root.val) {
            return false;
        }
        return isSubPathFromRoot(head.next, root.right) || isSubPathFromRoot(head.next, root.left);
    }
}

class CommonNode {
    ListNode curListNode;
    TreeNode curTreeNode;
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
