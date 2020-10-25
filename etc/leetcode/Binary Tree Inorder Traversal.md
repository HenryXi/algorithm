# Binary Tree Inorder Traversal
[Problem Description](https://leetcode.com/problems/binary-tree-inorder-traversal/)

**Solution 1**
```
public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur = root;
    while (cur != null || !stack.isEmpty()) {
        if (cur != null) {
            stack.push(cur);
            cur = cur.left;
        } else {
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
    }
    return res;
}


```
| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 37.5 MB	   |


**Solution 2**
```
public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
        return res;
    }
    if (root.left != null) {
        res.addAll(inorderTraversal(root.left));
    }
    res.add(root.val);
    if (root.right != null) {
        res.addAll(inorderTraversal(root.right));
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF