# Path Sum
[Problem Description](https://leetcode.com/problems/path-sum/)

```
public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
        return false;
    }
    if (root.left == null && root.right == null) {
        return root.val == targetSum;
    }
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 38.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF