# Insertion Sort List
[Problem Description](https://leetcode-cn.com/problems/insertion-sort-list/)

```
public ListNode insertionSortList(ListNode head) {
    ListNode dummy = new ListNode(0);
    ListNode pre;
    dummy.next = head;
    while (head != null && head.next != null) {
        if (head.val <= head.next.val) {
            head = head.next;
            continue;
        }
        pre = dummy;
        while (pre.next.val < head.next.val) {
            pre = pre.next;
        }
        ListNode curr = head.next;
        head.next = curr.next;
        curr.next= pre.next;
        pre.next = curr;

    }
    return dummy.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 6 ms | 38.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF