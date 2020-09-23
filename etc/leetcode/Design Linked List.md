# Design Linked List
[Problem Description](https://leetcode.com/problems/design-linked-list/)

```
class MyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index > size - 1) {
            return -1;
        }
        if (head == null) {
            return -1;
        }

        if (index <= size >> 1) {
            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.val;
        } else {
            ListNode cur = tail;
            for (int i = size - 1; i > index; i--) {
                cur = cur.pre;
            }
            return cur.val;
        }
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        if (head == null) {
            head = newHead;
            tail = newHead;
            size++;
            return;
        }
        newHead.next = head;
        head.pre = newHead;
        head = newHead;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        ListNode newTail = new ListNode(val);
        if (tail == null) {
            head = newTail;
            tail = newTail;
            size++;
            return;
        }
        tail.next = newTail;
        newTail.pre = tail;
        tail = newTail;
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        ListNode insertNode = new ListNode(val);
        if (index <= size >> 1) {
            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            ListNode pre = cur.pre;
            pre.next = insertNode;
            insertNode.pre = pre;
            insertNode.next = cur;
            cur.pre = insertNode;
        } else {
            ListNode cur = tail;
            for (int i = size - 1; i > index; i--) {
                cur = cur.pre;
            }
            ListNode pre = cur.pre;
            pre.next = insertNode;
            insertNode.pre = pre;
            insertNode.next = cur;
            cur.pre = insertNode;
        }
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }
        if (index <= size >> 1) {
            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            ListNode pre = cur.pre;
            ListNode next = cur.next;
            if (pre == null) {
                head = next;
                size--;
                return;
            }
            if (next == null) {
                tail = pre;
                size--;
                return;
            }
            pre.next = next;
            next.pre = pre;
        } else {
            ListNode cur = tail;
            for (int i = 0; i < size - index - 1; i++) {
                cur = cur.pre;
            }
            ListNode pre = cur.pre;
            ListNode next = cur.next;
            if (pre == null) {
                head = head.next;
                head.pre = null;
                size--;
                return;
            }
            if (next == null) {
                tail = tail.pre;
                tail.next = null;
                size--;
                return;
            }
            pre.next = next;
            next.pre = pre;
        }
        size--;
    }

    class ListNode {
        int val;
        ListNode pre;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public String toString() {
        String res = "[";
        ListNode cur = head;
        while (cur != null) {
            res = res + cur.val + ", ";
            cur = cur.next;
        }
        res = res + "]";
        res = res.replace(", ]", "]");
        return res;
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 8 ms | 40 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF