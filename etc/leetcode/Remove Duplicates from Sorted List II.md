# Remove Duplicates from Sorted List II
[Problem Description](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)

```
public static ListNode deleteDuplicates(ListNode head) {
    ListNode fake = new ListNode(0);
    fake.next = head;
    ListNode pre = fake;
    ListNode current = head;
    while (current != null && current.next != null) {
        if (current.val != current.next.val) {
            if (pre.next != current) {
                pre.next = current.next;
            } else {
                pre = pre.next;
            }
        }
        current = current.next;
    }
    if (pre.next != current) {
        pre.next = null;
    }
    return fake.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 40.9 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF