package com.henryxi.algorithm.tree.validatebinarysearchtree;

public class ValidateBinarySearchTreeClient {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15,new TreeNode(6),new TreeNode(20));
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {

    }

    private int[]
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