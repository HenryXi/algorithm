package com.henryxi.algorithm.tree.recoverbinarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class RecoverBinarySearchTreeClient {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(3, null,new TreeNode(2)), null);
        recoverTree(root);
        printTree(root);
    }

    private static void printTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.remove();
            System.out.println(curr == null ? null : curr.val);
            if (curr == null) {
                continue;
            }
            if (curr.left == null && curr.right == null) {
                continue;
            }
            queue.add(curr.left);
            queue.add(curr.right);
        }
    }

    //todo not finish
    static TreeNode t1, t2, pre;
    public static void recoverTree(TreeNode root) {
        inorder(root);
        int temp = t1.val;
        t1.val = t2.val;
        t2.val = temp;
    }
    public static void inorder(TreeNode root){
        if (root == null) return ;
        inorder(root.left);
        if (pre != null && pre.val > root.val) {
            if (t1 == null) {
                t1 = pre;
            }
            t2 = root;
        }
        pre = root;
        inorder(root.right);
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

