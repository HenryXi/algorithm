# Partition List
[Problem Description](https://leetcode.com/problems/partition-list/)

```
public static ListNode partition(ListNode head, int x) {
    ListNode small = new ListNode(0);
    ListNode smallTail = small;
    ListNode bigger = new ListNode(0);
    ListNode biggerTail = bigger;
    while (head != null) {
        if(head.val<x){
            smallTail.next=head;
            head=head.next;
            smallTail=smallTail.next;
            smallTail.next=null;
        }else{
            biggerTail.next=head;
            head=head.next;
            biggerTail=biggerTail.next;
            biggerTail.next=null;
        }

    }
    smallTail.next=bigger.next;
    return small.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 38.9 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF