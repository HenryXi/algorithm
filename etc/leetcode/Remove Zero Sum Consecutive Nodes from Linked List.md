# Remove Zero Sum Consecutive Nodes from Linked List
[Problem Description](https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/)

```
public ListNode removeZeroSumSublists(ListNode head) {
    ListNode dummy = new ListNode(0);
    ListNode pre = dummy;
    dummy.next = head;
    while (pre != null) {
        ListNode cur = pre.next;
        int sum = 0;
        while (cur != null) {
            sum = sum + cur.val;
            cur = cur.next;
            if (sum == 0) {
                pre.next = cur;
                break;
            }
        }
        if (cur == null) {
            pre = pre.next;
        }
    }
    return dummy.next;   
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 3 ms | 39 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF