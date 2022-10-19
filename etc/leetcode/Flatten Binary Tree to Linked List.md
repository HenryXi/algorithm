# Flatten Binary Tree to Linked List
[Problem Description](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)

```
public void flatten(TreeNode root) {
    if(root==null){
        return;
    }
    flatten(root.left);
    TreeNode right = root.right;
    root.right = root.left;
    root.left = null;
    while(root.right!=null){
        root=root.right;
    }
    flatten(right);
    root.right = right;
}
```

| Runtime | Memory   | 
|:--------|:---------|
| 1 ms    | 43.3 MB	 |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF