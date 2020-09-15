# Linked List Cycle
[Problem Description](https://leetcode.com/problems/linked-list-cycle/)

```
public static boolean hasCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while (true) {
        if (fast == null) {
            return false;
        }
        if (fast.next == null) {
            return false;
        }
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow) {
            return true;
        }
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 42.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF