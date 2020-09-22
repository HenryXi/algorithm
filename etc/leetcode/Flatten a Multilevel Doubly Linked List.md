# Flatten a Multilevel Doubly Linked List
[Problem Description](https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/)

```
public Node flatten(Node head) {
    if (head == null) {
        return null;
    }
    Node cur = head;
    while (cur != null) {
        if (cur.child != null) {
            Node next = cur.next;
            cur.next = flatten(cur.child);
            cur.child = null;
            cur.next.prev = cur;
            if (next != null) {
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = next;
                next.prev = cur;
            }
        }
        cur = cur.next;
    }
    return head;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 37.7 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF