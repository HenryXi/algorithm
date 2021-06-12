# Symmetric Tree
[Problem Description](https://leetcode.com/problems/symmetric-tree/)

```
public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root.left);
    queue.add(root.right);
    while (!queue.isEmpty()) {
        TreeNode n1 = queue.poll();
        TreeNode n2 = queue.poll();
        if (n1 == null && n2 == null) {
            continue;
        }
        if (n1 == null || n2 == null) {
            return false;
        }
        if (n1.val != n2.val) {
            return false;
        }
        queue.add(n1.left);
        queue.add(n2.right);
        queue.add(n1.right);
        queue.add(n2.left);
    }
    return true;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 38.3 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF