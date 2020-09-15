# Copy List with Random Pointer
[Problem Description](https://leetcode.com/problems/copy-list-with-random-pointer/)

```
public static Node copyRandomList(Node head) {
    Node cur = head;
    while (cur != null) {
        Node newNode = new Node(cur.val);
        newNode.next = cur.next;
        cur.next = newNode;
        cur = cur.next.next;
    }
    cur = head;
    while (cur != null) {
        Node next = cur.next;
        next.random = cur.random == null ? null : cur.random.next;
        cur = cur.next.next;
    }
    cur = head;
    Node fake = new Node(0);
    Node dummy = fake;
    while (cur != null) {
        Node next = cur.next;
        fake.next = next;
        cur.next = next.next;
        cur = cur.next;
        fake = fake.next;
    }
    return dummy.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 38.6 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF