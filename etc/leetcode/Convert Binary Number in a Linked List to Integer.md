# Convert Binary Number in a Linked List to Integer

[Problem Description](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)

```
public static int getDecimalValue(ListNode head) {
    if (head == null) {
        return 0;
    }
    int res = 0;
    while (head != null) {
        res = res * 2 + head.val;
        head = head.next;
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
|  0 ms | 36.3 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF