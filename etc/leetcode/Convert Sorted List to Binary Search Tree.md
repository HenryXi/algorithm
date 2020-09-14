# Convert Sorted List to Binary Search Tree
[Problem Description](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/)

```
public TreeNode sortedListToBST(ListNode head) {
     if (head == null) {
        return null;
    }
    if (head.next == null) {
        return new TreeNode(head.val);
    }
    ListNode pre = head;
    ListNode mid = pre.next;
    ListNode last = mid.next;
    while (last != null && last.next != null) {
        last = last.next.next;
        mid = mid.next;
        pre = pre.next;
    }
    pre.next = null;

    return new TreeNode(mid.val, sortedListToBST(head), sortedListToBST(mid.next));
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 44.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF