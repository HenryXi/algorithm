# Remove Duplicates from Sorted List
[Problem Description](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

```
public static ListNode deleteDuplicates(ListNode head) {
    ListNode cursor = head;
    while (cursor!=null && cursor.next != null) {
        if (cursor.val == cursor.next.val) {
            cursor.next = cursor.next.next;
        } else {
            cursor = cursor.next;
        }
    }
    return head;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 41.8 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF