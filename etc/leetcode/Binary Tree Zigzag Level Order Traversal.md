# Binary Tree Zigzag Level Order Traversal
[Problem Description](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)

```
public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> ans = new LinkedList<>();
    if (root == null) {
        return ans;
    }
    Queue<TreeNode> nodeQueue = new LinkedList<>();
    nodeQueue.add(root);
    boolean fromLeftToRight = false;
    while (!nodeQueue.isEmpty()) {
        Deque<Integer> subList = new LinkedList<>();
        int size = nodeQueue.size();
        for (int i = 0; i < size; i++) {
            TreeNode curr = nodeQueue.poll();
            if (fromLeftToRight) {
                subList.addLast(curr.val);
            } else {
                subList.addFirst(curr.val);
            }
            if (curr.right != null) {
                nodeQueue.add(curr.right);
            }
            if (curr.left != null) {
                nodeQueue.add(curr.left);
            }
        }
        ans.add(new LinkedList<>(subList));
        fromLeftToRight = !fromLeftToRight;
    }
    return ans;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 39 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF