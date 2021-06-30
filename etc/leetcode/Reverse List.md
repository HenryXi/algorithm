# Reverse List
[Problem Description](https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/)

```
public ListNode reverseList(ListNode head) {
    ListNode dummy = new ListNode(0);
    ListNode cur = head;
    ListNode pre = dummy;
    dummy.next = head;
    while (cur != null && cur.next != null) {
        ListNode next = cur.next;
        cur.next = next.next;
        next.next = pre.next;
        pre.next = next;
    }
    return dummy.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 37.8 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF