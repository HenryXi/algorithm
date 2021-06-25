# Same Tree
[Problem Description](https://leetcode.com/problems/same-tree/)

```
public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
        return true;
    }
    if (p == null || q == null) {
        return false;
    }
    return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 35.8 MB|


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF