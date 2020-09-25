# Split Linked List in Parts
[Problem Description](https://leetcode.com/problems/split-linked-list-in-parts/)

```
public ListNode[] splitListToParts(ListNode root, int k) {
    ListNode[] listNodes = new ListNode[k];
    ListNode cur = root;
    int length = 0;
    while (cur != null) {
        cur = cur.next;
        length++;
    }
    ListNode pre = new ListNode(0);
    if (k >= length) {
        cur = root;
        for (int i = 0; i < k; i++) {
            listNodes[i] = cur;
            if (cur != null) {
                pre = cur;
                cur = cur.next;
                pre.next = null;
            } else {
                cur = null;
            }
        }
        return listNodes;
    }
    int subLength = length / k;
    int mod = length % k;
    cur = root;
    for (int i = 0; i < k; i++) {
        listNodes[i] = cur;
        int step = subLength + (mod > 0 ? 1 : 0);
        if (mod > 0) {
            mod--;
        }
        for (int j = 0; j < step; j++) {
            if (cur == null) {
                return listNodes;
            }
            pre = cur;
            cur = cur.next;
        }
        pre.next = null;
    }
    return listNodes;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39.1 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF