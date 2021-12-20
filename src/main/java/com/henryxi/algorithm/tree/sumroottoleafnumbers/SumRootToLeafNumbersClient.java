package com.henryxi.algorithm.tree.sumroottoleafnumbers;

public class SumRootToLeafNumbersClient {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        SumRootToLeafNumbersClient client = new SumRootToLeafNumbersClient();
        System.out.println(client.sumNumbers(root));
    }

    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    private int sum(TreeNode root, int currentVal) {
        if (root == null) {
            return 0;
        }
        currentVal = currentVal * 10 + root.val;
        if (root.left == null && root.right == null) {
            return currentVal;
        } else {
            return sum(root.left, currentVal) + sum(root.right, currentVal);
        }
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

