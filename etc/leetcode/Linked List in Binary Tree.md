# Linked List in Binary Tree
[Problem Description](https://leetcode.com/problems/linked-list-in-binary-tree/)

```
public static boolean isSubPath(ListNode head, TreeNode root) {
    if (root == null) {
        return false;
    }
    return isSubPathFromRoot(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
}

private static boolean isSubPathFromRoot(ListNode head, TreeNode root) {
    if (head == null) {
        return true;
    }
    if (root == null) {
        return false;
    }
    if (head.val != root.val) {
        return false;
    }
    return isSubPathFromRoot(head.next, root.right) || isSubPathFromRoot(head.next, root.left);
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 39.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF