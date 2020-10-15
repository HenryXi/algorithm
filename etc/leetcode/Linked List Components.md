# Linked List Components
[Problem Description](https://leetcode.com/problems/linked-list-components/)

```
public static int numComponents(ListNode head, int[] G) {
    int maxNum = -1;
    for (int num : G) {
        if (num > maxNum) {
            maxNum = num;
        }
    }

    boolean[] arr = new boolean[maxNum + 1];
    for (int num : G) {
        arr[num] = true;
    }
    int componentsNum = 0;
    while (head != null) {
        if (head.next == null) {
            if (exist(head.val, arr)) {
                componentsNum++;
            }
        } else {
            if (exist(head.val, arr) && !exist(head.next.val, arr)) {
                componentsNum++;
            }
        }
        head = head.next;
    }
    return componentsNum;
}

private static boolean exist(int value, boolean[] arr) {
    if (value >= arr.length) {
        return false;
    }
    return arr[value];
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 39.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF