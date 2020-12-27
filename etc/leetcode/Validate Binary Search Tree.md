# Validate Binary Search Tree
[Problem Description](https://leetcode.com/problems/validate-binary-search-tree/)

```
public static boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
}

private static boolean isValidBST(TreeNode currentNode, Integer low, Integer high) {
    if (currentNode == null) {
        return true;
    }
    if ((high != null && high <= currentNode.val) || (low != null && low >= currentNode.val)) {
        return false;
    }
    return isValidBST(currentNode.left, low, currentNode.val) && isValidBST(currentNode.right, currentNode.val, high);
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 38.7 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF