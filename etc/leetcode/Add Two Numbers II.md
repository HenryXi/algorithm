# Add Two Numbers II
[Problem Description](https://leetcode.com/problems/add-two-numbers-ii/)

```
public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode cursor1 = l1;
    ListNode cursor2 = l2;
    int l1Length = 0;
    int l2Length = 0;
    while (cursor1 != null) {
        cursor1 = cursor1.next;
        l1Length++;
    }
    while (cursor2 != null) {
        cursor2 = cursor2.next;
        l2Length++;
    }
    if (l1Length > l2Length) {
        return add(l1, l2, l1Length - l2Length);
    } else {
        return add(l2, l1, l2Length - l1Length);
    }
}

public static ListNode add(ListNode longList, ListNode shortList, int gap) {
    ListNode longCur = longList;
    ListNode shortCur = shortList;
    for (int i = 0; i < gap; i++) {
        longCur = longCur.next;
    }
    while (longCur != null) {
        longCur.val = longCur.val + shortCur.val;
        longCur = longCur.next;
        shortCur = shortCur.next;
    }
    return handleCarry(longList);
}

public static ListNode handleCarry(ListNode listNode) {
    ListNode dummy = new ListNode(0);
    dummy.next = listNode;
    ListNode longCur = dummy;
    while (longCur.next != null) {
        if (longCur.next.val >= 10) {
            longCur.val = longCur.val + 1;
            longCur.next.val = longCur.next.val % 10;
            if (longCur.val >= 10) {
                longCur = dummy;
                continue;
            }
        }
        longCur = longCur.next;
    }
    if (dummy.val > 0) {
        return dummy;
    }
    return dummy.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 2 ms | 39.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF