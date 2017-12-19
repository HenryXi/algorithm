# Java reversing single linked list
In this page I will show you how to reverse single linked list in loop. Before starting write logic we need defined
`Node` class.
```java
public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
```
The logic of reversing single linked list
```java
public class ReverseClient {
    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        print(node2);
        Node reverseNode = reverse(node2);
        print(reverseNode);
    }

    private static Node reverse(Node head) {
        System.out.println();
        if (head == null) {
            return head;
        }
        Node pre = head;
        Node current = head.next;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        head.next=null;
        head=pre;
        return head;
    }

    private static void print(Node node) {
        while (node != null) {
            if (node.next == null) {
                System.out.print(node.data);
            } else {
                System.out.print(node.data + " -> ");
            }
            node = node.next;
        }
    }
}
```
**Summary**

The most important point is find the "pre", "current" and "next" node. Make next pointer of "current" node to
"pre" node and move them to next step. Do not forget make the "next" pointer of head as null in the end.

EOF