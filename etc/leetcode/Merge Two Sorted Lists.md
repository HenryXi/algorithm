# Merge Two Sorted Lists
[Problem Description](https://leetcode.com/problems/merge-two-sorted-lists/)

```
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode res = new ListNode(0);
    ListNode cursor=res;
    while (l1!=null && l2!=null){
        if(l1.val>l2.val){
            cursor.next=l2;
            l2=l2.next;
            cursor=cursor.next;
        }else{
            cursor.next=l1;
            l1=l1.next;
            cursor=cursor.next;
        }
    }
    if(l1==null){
        cursor.next=l2;
    }else{
        cursor.next=l1;
    }
    return res.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF