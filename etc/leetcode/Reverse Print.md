# Reverse Print
[Problem Description](https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/)

```
public int[] reversePrint(ListNode head) {
    ListNode p = head;
    int count = 0;
    while (p != null) {
        p = p.next;
        count++;
    }
    int[] res = new int[count];
    int index = res.length - 1;
    while (head != null) {
        res[index] = head.val;
        head = head.next;
        index--;
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF