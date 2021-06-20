# Reverse Nodes in k-Group
[Problem Description](https://leetcode.com/problems/reverse-nodes-in-k-group/)

```
public static ListNode myReverseKGroup(ListNode head, int k) {
    int length = 0;
    ListNode dummy = new ListNode(0);
    ListNode pre = dummy;
    ListNode cur = head;
    ListNode next;
    dummy.next = head;
    while (true) {
        head = head.next;
        length++;
        if (head == null) {
            break;
        }
    }

    for (int i = 0; i < length / k; i++) {
        for (int j = 0; j < k - 1; j++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        pre = cur;
        cur = pre.next;
    }
    return dummy.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF