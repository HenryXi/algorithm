# Remove Linked List Elements
[Problem Description](https://leetcode.com/problems/remove-linked-list-elements/)

```
public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = dummy;
    while(cur.next!=null){
        if(cur.next.val==val){
            cur.next=cur.next.next;
        }else{
            cur = cur.next;
        }
    }
    return dummy.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 40.1 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF