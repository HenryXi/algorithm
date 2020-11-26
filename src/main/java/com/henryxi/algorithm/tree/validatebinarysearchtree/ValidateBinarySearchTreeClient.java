package com.henryxi.algorithm.tree.validatebinarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTreeClient {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-1);
//        root.right = new TreeNode(3);
        System.out.println(isValidBST(root));
    }

    static List<Integer> ans = new ArrayList<>();

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        getInorderTraversal(root, ans);
        for (int i = 1; i < ans.size(); i++) {
            if (ans.get(i) <= ans.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static void getInorderTraversal(TreeNode node, List<Integer> ans) {
        if (node == null) {
            return;
        }
        getInorderTraversal(node.left, ans);
        ans.add(node.val);
        getInorderTraversal(node.right, ans);
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