package com.henryxi.algorithm.tree.maximumdepthofbinarytree;

public class MaximumDepthOfBinaryTreeClient {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        int depth = 0;
        if (root != null) {
            depth++;
            depth = depth + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
        return depth;
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
