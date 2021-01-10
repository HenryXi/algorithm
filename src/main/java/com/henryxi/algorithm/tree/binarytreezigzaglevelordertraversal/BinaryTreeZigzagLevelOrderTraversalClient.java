package com.henryxi.algorithm.tree.binarytreezigzaglevelordertraversal;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversalClient {
    public static void main(String[] args) {
        //todo not finish
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.pop();
        }
        return null;
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
