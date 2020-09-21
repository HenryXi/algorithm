# Palindrome Linked List
[Problem Description](https://leetcode.com/problems/palindrome-linked-list/)

```
public static boolean isPalindrome(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy;
    ListNode slow = dummy;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }

    ListNode left = dummy.next;
    ListNode right = slow.next;
    slow.next = null;
    ListNode reversed = reverse(right);
    while (left != null && reversed != null) {
        if (left.val != reversed.val) {
            return false;
        }
        left = left.next;
        reversed = reversed.next;
    }
    return true;
}

public static ListNode reverse(ListNode head) {
    ListNode curr = head;
    ListNode pre = null;
    while (curr != null) {
        ListNode next = curr.next;
        curr.next = pre;
        pre = curr;
        curr = next;
    }
    return pre;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 41.1 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF