package com.henryxi.algorithm.tree.invertbinarytree;

public class InvertBinaryTreeClient {
    public static void main(String[] args) {
        InvertBinaryTreeClient client = new InvertBinaryTreeClient();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        client.invertTree(root);
        System.out.println(root);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        swap(root);
        return root;
    }

    private void swap(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        swap(root.left);
        swap(root.right);
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

    @Override
    public String toString() {
        return "val=" + val +
                ", left=" + left +
                ", right=" + right;
    }
}

