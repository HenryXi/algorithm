package com.henryxi.algorithm.tree.deletenodeinabst;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteNodeInABSTClient {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
        TreeNode result = deleteNode(root, 3);
        printTree(result);
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.remove();
            System.out.println(cur == null ? null : cur.val);
            if (cur == null) {
                continue;
            }
            if (cur.left == null && cur.right == null) {
                continue;
            }
            if (cur.left != null) {
                queue.add(cur.left);
            } else {
                queue.add(null);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            } else {
                queue.add(null);
            }
        }

    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode result = getMin(root.right);
                result.right = deleteMinAndReturnRoot(root.right);
                result.left = root.left;
                return result;
            }
        }
    }

    private static TreeNode getMin(TreeNode root) {
        if (root.left == null) {
            return root;
        }
        return getMin(root.left);
    }

    private static TreeNode deleteMinAndReturnRoot(TreeNode root) {
        if (root.left == null) {
            return root.right;
        }
        root.left = deleteMinAndReturnRoot(root.left);
        return root;
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

