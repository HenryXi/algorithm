# Get Kth From End
[Problem Description](https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/)

```
public ListNode getKthFromEnd(ListNode head, int k) {
    if (head == null || k < 1) {
        return null;
    }
    ListNode pointer1 = head;
    for (int i = 0; i < k; i++) {
        pointer1 = pointer1.next;
    }
    ListNode pointer2 = head;
    while (true) {
        if (pointer1 == null) {
            return pointer2;
        }
        pointer1 = pointer1.next;
        pointer2 = pointer2.next;
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.3 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF