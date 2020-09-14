# Rotate List
[Problem Description](https://leetcode.com/problems/rotate-list/)

```
public static ListNode rotateRight(ListNode head, int k) {
    if(head==null){
        return null;
    }
    int count = 0;
    ListNode cursor = head;
    while (cursor != null) {
        count++;
        cursor = cursor.next;
    }
    k = k% count  ;
    if(k==0){
        return head;
    }
    cursor = head;
    ListNode cursor2 = head;
    for (int i = 0; i < k; i++) {
        cursor=cursor.next;
    }
    while (cursor.next!=null){
        cursor=cursor.next;
        cursor2=cursor2.next;
    }
    ListNode newHead = cursor2.next;
    cursor2.next=null;
    cursor.next=head;
    return newHead;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF