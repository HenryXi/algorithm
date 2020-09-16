# Linked List Cycle II
[Problem Description](https://leetcode.com/problems/linked-list-cycle-ii/)

```
public ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while (true) {
        if (fast == null) {
            return null;
        }
        if (fast.next == null) {
            return null;
        }
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow) {
            break;
        }
    }
    slow = head;
    while (true) {
        if (slow == fast) {
            return slow;
        }
        slow = slow.next;
        fast = fast.next;
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39.1 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF