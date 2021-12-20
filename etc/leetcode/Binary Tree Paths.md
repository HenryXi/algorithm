# Binary Tree Paths
[Problem Description](https://leetcode.com/problems/binary-tree-paths/)

```
public List<String> binaryTreePaths(TreeNode root) {
    List<String> result = new LinkedList<>();
    contact(root, "", result);
    return result;
}

private void contact(TreeNode root, String path, List<String> result) {
    if (root == null) {
        return;
    }
    StringBuilder sb = new StringBuilder(path);
    sb.append(root.val);
    if (root.left == null && root.right == null) {
        result.add(sb.toString());
    } else {
        sb.append("->");
        contact(root.left, sb.toString(), result);
        contact(root.right, sb.toString(), result);
    }

}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 38.7 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF