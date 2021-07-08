# Binary Tree Preorder Traversal
[Problem Description](https://leetcode.com/problems/binary-tree-preorder-traversal/)

```
public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    if (root == null) {
        return res;
    }
    res.add(root.val);
    res.addAll(preorderTraversal(root.left));
    res.addAll(preorderTraversal(root.right));
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.8 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF