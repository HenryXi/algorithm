package com.henryxi.algorithm.tree.binarytreepreordertraversal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversalClient {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2, new TreeNode(3), null);
        BinaryTreePreorderTraversalClient client =  new BinaryTreePreorderTraversalClient();
        System.out.println(client.preorderTraversal(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
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

