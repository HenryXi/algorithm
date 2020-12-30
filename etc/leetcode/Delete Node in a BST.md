# Delete Node in a BST
[Problem Description](https://leetcode.com/problems/delete-node-in-a-bst/)

```
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
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39.3 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF