# Swap Nodes in Pairs
[Problem Description](https://leetcode.com/problems/swap-nodes-in-pairs/)

```
public static ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    ListNode cursor = head.next;
    head.next = swapPairs(cursor.next);
    cursor.next = head;
    return cursor;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.9 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF