# Sum Root to Leaf Numbers
[Problem Description](https://leetcode.com/problems/sum-root-to-leaf-numbers/)

```
public int sumNumbers(TreeNode root) {
    return sum(root, 0);
}

private int sum(TreeNode root, int currentVal) {
    if (root == null) {
        return 0;
    }
    currentVal = currentVal * 10 + root.val;
    if (root.left == null && root.right == null) {
        return currentVal;
    } else {
        return sum(root.left, currentVal) + sum(root.right, currentVal);
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 35.7 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF