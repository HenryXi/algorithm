# Java find n'th node from the end of linked list
`linked list` is one the most common data structure. You can find the next node by current node, but you can not find the 
previous node by current(for single linked list). The question is how to find n'th node from the end of linked list. 

Answer is here:

* use two pointer, first pointer go n step
* second pointer and first one both iterate the list until first pointer point to null.

**sample code**
```java
public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    public Node head;
    public Node current;

    private void add(int data) {
        if (head == null) {
            head = new Node(data);
            current = head;
        } else {
            current.next = new Node(data);
            current = current.next;
        }
    }

    public Node init(int length) {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            this.add(random.nextInt(100));
        }
        return head;
    }

    @Override
    public String toString() {
        if (this.head == null) {
            return "null";
        }
        current = this.head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            if (sb.length() != 0) {
                sb.append("->");
            }
            sb.append(current.data);
            current = current.next;
        }
        return sb.toString();
    }
}

public class FindLastNNode {

    public static void main(String[] args) {
        int l = 10;
        int n = 6;
        LinkedList linkedList = new LinkedList();
        linkedList.init(l);
        System.out.println("linked list:" + linkedList);
        Node target = findLastN(linkedList, n);
        System.out.println("the " + n + " node from end:" + target.data);
    }

    private static Node findLastN(LinkedList linkedList, int n) {
        if (linkedList == null || n < 1) {
            return null;
        }
        Node pointer1 = linkedList.head;
        for (int i = 0; i < n; i++) {
            pointer1 = pointer1.next;
        }
        Node pointer2 = linkedList.head;
        while (true) {
            if (pointer1 == null) {
                return pointer2;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
    }
}
```
**output**
```
linked list:14->68->66->95->56->10->14->99->37->75
the 6 node from end:56
```
EOF