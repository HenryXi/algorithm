# Reverse Linked List II
[Problem Description](https://leetcode.com/problems/reverse-linked-list-ii/)

```
public ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode fake = new ListNode(0);
    fake.next = head;
    ListNode pre = fake;
    for (int i = 0; i < m-1; i++) {
        pre = pre.next;
    }
    ListNode next;
    ListNode current = pre.next;
    for (int i = m; i < n; i++) {
        next = current.next;
        current.next=next.next;
        next.next=pre.next;
        pre.next=next;
    }
    return fake.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.8 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF