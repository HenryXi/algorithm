# Remove Nth Node From End of List
[Problem Description](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

```
public static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode cursor1 = head;
    ListNode cursor2 = head;
    for (int i = 0; i < n; i++) {
        cursor1 = cursor1.next;
    }
    if(cursor1==null){
        return cursor2.next;
    }
    while (cursor1.next != null) {
        cursor2=cursor2.next;
        cursor1=cursor1.next;
    }
    cursor2.next=cursor2.next.next;

    return head;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 37.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF