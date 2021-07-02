# Minimum Depth of Binary Tree
[Problem Description](https://leetcode.com/problems/minimum-depth-of-binary-tree/)

```
public int minDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }
    if (root.left == null && root.right == null) {
        return 1;
    }
    int minDepth = Integer.MAX_VALUE;
    if (root.left != null) {
        minDepth = Math.min(minDepth(root.left), minDepth);
    }
    if (root.right != null) {
        minDepth = Math.min(minDepth(root.right), minDepth);
    }
    return minDepth + 1;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 4 ms | 59.9 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF