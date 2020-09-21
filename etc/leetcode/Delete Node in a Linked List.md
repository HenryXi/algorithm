# Delete Node in a Linked List
[Problem Description](https://leetcode.com/problems/delete-node-in-a-linked-list/)

```
public void deleteNode(ListNode node) {
    ListNode next = node.next;
    node.val = next.val;
    node.next = next.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 38.3 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF