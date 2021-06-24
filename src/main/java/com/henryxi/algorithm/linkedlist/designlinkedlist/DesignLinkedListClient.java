package com.henryxi.algorithm.linkedlist.designlinkedlist;

public class DesignLinkedListClient {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(38);

        linkedList.addAtTail(66);

        linkedList.addAtTail(61);

        linkedList.addAtTail(76);

        linkedList.addAtTail(26);

        linkedList.addAtTail(37);

        linkedList.addAtTail(8);

        linkedList.deleteAtIndex(5);

        linkedList.addAtHead(4);

        linkedList.addAtHead(45);

        linkedList.get(4);

        linkedList.addAtTail(85);

        linkedList.addAtHead(37);

        linkedList.get(5);

        linkedList.addAtTail(93);

        linkedList.addAtIndex(10, 23);

        linkedList.addAtTail(21);

        linkedList.addAtHead(52);

        linkedList.addAtHead(15);

        linkedList.addAtHead(47);

        linkedList.get(12);

        linkedList.addAtIndex(6, 24);

        linkedList.addAtHead(64);

        linkedList.get(4);

        linkedList.addAtHead(31);

        linkedList.deleteAtIndex(6);

        linkedList.addAtHead(40);

        linkedList.addAtTail(17);

        linkedList.addAtTail(15);

        linkedList.addAtIndex(19, 2);

        linkedList.addAtTail(11);

        linkedList.addAtHead(86);

        linkedList.get(17);

        linkedList.addAtTail(55);

        linkedList.deleteAtIndex(15);

        linkedList.addAtIndex(14, 95);

        linkedList.deleteAtIndex(22);

        linkedList.addAtHead(66);

        linkedList.addAtTail(95);

        linkedList.addAtHead(8);

        linkedList.addAtHead(47);

        linkedList.addAtTail(23);

        linkedList.addAtTail(39);

        linkedList.get(30);

        linkedList.get(27);

        linkedList.addAtHead(0);

        linkedList.addAtTail(99);

        linkedList.addAtTail(45);

        linkedList.addAtTail(4);

        linkedList.addAtIndex(9, 11);

        linkedList.get(6);

        linkedList.addAtHead(81);

        linkedList.addAtIndex(18, 32);

        linkedList.addAtHead(20);

        linkedList.addAtTail(13);

        linkedList.addAtTail(42);

        linkedList.addAtIndex(37, 91);

        linkedList.deleteAtIndex(36);

        linkedList.addAtIndex(10, 37);

        linkedList.addAtHead(96);

        linkedList.addAtHead(57);

        linkedList.deleteAtIndex(20);

        linkedList.addAtTail(89);

        linkedList.deleteAtIndex(18);

        linkedList.addAtIndex(41, 5);

        linkedList.addAtTail(23);

        linkedList.addAtHead(75);

        linkedList.get(7);

        linkedList.addAtIndex(25, 51);

        linkedList.addAtTail(48);

        linkedList.addAtHead(46);

        linkedList.addAtHead(29);

        linkedList.addAtHead(85);

        linkedList.addAtHead(82);

        linkedList.addAtHead(6);

        linkedList.addAtHead(38);

        linkedList.deleteAtIndex(14);

        linkedList.get(1);

        linkedList.get(12);

        linkedList.addAtHead(42);

        linkedList.get(42);

        linkedList.addAtTail(83);

        linkedList.addAtTail(13);

        linkedList.addAtIndex(14, 20);

        linkedList.addAtIndex(17, 34);

        linkedList.addAtHead(36);

        linkedList.addAtTail(58);

        linkedList.addAtTail(2);

        linkedList.get(38);

        linkedList.addAtIndex(33, 59);

        linkedList.addAtHead(37);

        linkedList.deleteAtIndex(15);

        linkedList.addAtTail(64);

        linkedList.get(56);

        linkedList.addAtHead(0);

        linkedList.get(40);

        linkedList.addAtHead(92);

        linkedList.deleteAtIndex(63);
        System.out.println(linkedList.toString());
        linkedList.get(35);
        System.out.println(linkedList.toString());
        linkedList.addAtTail(62);

        linkedList.addAtTail(32);

        System.out.println("luck");
    }
}

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

    class ListNode {
        int val;
        ListNode pre;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
