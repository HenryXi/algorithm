# Middle of the Linked List
[Problem Description](https://leetcode.com/problems/middle-of-the-linked-list/)

```
public ListNode middleNode(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode slow = dummy;
    ListNode fast = dummy;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    if (fast == null) {
        return slow;
    }
    return slow.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF