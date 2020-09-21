# Odd Even Linked List
[Problem Description](https://leetcode.com/problems/odd-even-linked-list/)

```
public static ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    ListNode l1curr = head;
    ListNode l2head = head.next;
    ListNode l2curr = l2head;
    while (l1curr.next != null && l2curr.next != null) {
        l1curr.next = l2curr.next;
        l1curr = l1curr.next;
        l2curr.next = l1curr.next;
        l2curr = l2curr.next;
    }
    l1curr.next = l2head;
    return head;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39.1 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF