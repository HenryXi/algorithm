# Maximum Depth of Binary Tree
[Problem Description](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

```
public static int maxDepth(TreeNode root) {
    int depth = 0;
    if (root != null) {
        depth++;
        depth = depth + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    return depth;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 45 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF