package com.henryxi.algorithm.tree.binarytreeinordertraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversalClient {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = null;
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        List<Integer> integers = inorderTraversal(treeNode);
        System.out.println(integers.toString());
    }

    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        return res;
    }


    public static List<Integer> inorderTraversalRecursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        if (root.left != null) {
            res.addAll(inorderTraversalRecursion(root.left));
        }
        res.add(root.val);
        if (root.right != null) {
            res.addAll(inorderTraversalRecursion(root.right));
        }
        return res;
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
