# Invert Binary Tree
[Problem Description](https://leetcode.com/problems/invert-binary-tree/)

```
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
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF