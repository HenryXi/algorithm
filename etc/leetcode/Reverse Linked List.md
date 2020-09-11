# Reverse Linked List
[Problem Description](https://leetcode.com/problems/reverse-linked-list/submissions/)

```
public static ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode current = head;
    ListNode next;
    while (current != null) {
        next = current.next;
        current.next = pre;
        pre = current;
        current = next;
    }
    return pre;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF