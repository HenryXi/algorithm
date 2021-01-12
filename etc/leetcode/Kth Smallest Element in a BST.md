# Kth Smallest Element in a BST
[Problem Description](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)

```
public static int kthSmallest(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<>();
    int curIndex = 0;
    TreeNode cur = root;
    while (cur != null || !stack.isEmpty()) {
        if (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }else{
            cur = stack.pop();
            if(curIndex==k-1){
                return cur.val;
            }
            curIndex++;
            cur = cur.right;
        }
    }
    return -1;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
|  0 ms | 39.3 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF