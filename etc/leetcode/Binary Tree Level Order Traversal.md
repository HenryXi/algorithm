# Binary Tree Level Order Traversal
[Problem Description](https://leetcode.com/problems/binary-tree-level-order-traversal/)

```
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new LinkedList<>();
    if (root == null) {
        return res;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        res.add(allChild(queue));
    }
    return res;
}

private List<Integer> allChild(Queue<TreeNode> queue) {
    List<Integer> list = new LinkedList<>();
    int size = queue.size();
    for (int i = 0; i < size; i++) {
        TreeNode curr = queue.poll();
        if (curr == null) {
            return list;
        }
        if (curr.left != null) {
            queue.add(curr.left);
        }
        if (curr.right != null) {
            queue.add(curr.right);
        }
        list.add(curr.val);
    }
    return list;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF