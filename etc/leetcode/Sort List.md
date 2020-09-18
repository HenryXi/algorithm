# Sort List
[Problem Description](https://leetcode.com/problems/sort-list/)

```
public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head.next.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode rightL = slow.next;
        slow.next=null;
        ListNode left = sortList(head);
        ListNode right = sortList(rightL);
        return merge(left, right);
    }

    private static ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if (left == null) {
            curr.next = right;
        } else {
            curr.next = left;
        }
        return dummy.next;
    }
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 3 ms | 41.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF