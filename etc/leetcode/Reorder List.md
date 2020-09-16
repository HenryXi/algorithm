# Reorder List
[Problem Description](https://leetcode.com/problems/reorder-list/)

```
public static void reorderList(ListNode head) {
    if (head == null) {
        return;
    }
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    ListNode tobeReverse = slow.next;
    slow.next = null;
    ListNode reversedListNode = reverse(tobeReverse);
    ListNode curr = head;
    while (curr != null && reversedListNode != null) {
        ListNode next = curr.next;
        curr.next = reversedListNode;
        reversedListNode = reversedListNode.next;
        curr.next.next = next;
        curr = next;
    }
}

public static ListNode reverse(ListNode head) {
    ListNode cur = head;
    ListNode pre = null;
    while (cur != null) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 42.7 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF