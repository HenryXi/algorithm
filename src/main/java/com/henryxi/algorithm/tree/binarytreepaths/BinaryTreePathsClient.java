package com.henryxi.algorithm.tree.binarytreepaths;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePathsClient {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        BinaryTreePathsClient client = new BinaryTreePathsClient();
        System.out.println(client.binaryTreePaths(root));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        contact(root, "", result);
        return result;
    }

    private void contact(TreeNode root, String path, List<String> result) {
        if (root == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(path);
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            result.add(sb.toString());
        } else {
            sb.append("->");
            contact(root.left, sb.toString(), result);
            contact(root.right, sb.toString(), result);
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

