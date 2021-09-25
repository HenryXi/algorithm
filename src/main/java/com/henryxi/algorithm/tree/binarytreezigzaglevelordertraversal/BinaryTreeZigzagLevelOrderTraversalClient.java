package com.henryxi.algorithm.tree.binarytreezigzaglevelordertraversal;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversalClient {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        boolean fromLeftToRight = false;
        while (!nodeQueue.isEmpty()) {
            Deque<Integer> subList = new LinkedList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = nodeQueue.poll();
                if (fromLeftToRight) {
                    subList.addLast(curr.val);
                } else {
                    subList.addFirst(curr.val);
                }
                if (curr.right != null) {
                    nodeQueue.add(curr.right);
                }
                if (curr.left != null) {
                    nodeQueue.add(curr.left);
                }
            }
            ans.add(new LinkedList<>(subList));
            fromLeftToRight = !fromLeftToRight;
        }
        return ans;
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
