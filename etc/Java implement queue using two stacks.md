# Java implement queue using two stacks
There are two ways to implement queue by using two stacks. The first way is moving all items to another when `push` or `poll`
method invoked. Another way is using second stack hold some items, move items when needed.

**Solution1**: move items when `push` or `poll` method invoked. (not recommend)
```java
public class StackQueue1 {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void add(int item) {
        if (!stack2.isEmpty()) {
            moveAllItemToAnother(stack2, stack1);
        }
        stack1.push(item);
    }

    public int poll() {
        if (stack2.isEmpty()) {
            moveAllItemToAnother(stack1, stack2);
        }
        if (stack2.isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        return stack2.pop();
    }

    private void moveAllItemToAnother(Stack<Integer> fromStack, Stack<Integer> toStack) {
        while (true) {
            if (fromStack.isEmpty()) {
                return;
            }
            toStack.push(fromStack.pop());
        }
    }
}
```
**Solution2**: move items when needed. (recommend)
```java
public class StackQueue2 {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void add(int item) {
        stack1.push(item);
    }

    public int poll() {
        if (stack2.isEmpty()) {
            while (true) {
                if (stack1.isEmpty()) {
                    System.out.println("queue empty");
                    return -1;
                } else {
                    Integer top = stack1.pop();
                    if (stack1.isEmpty()) {
                        return top;
                    }
                    stack2.push(top);
                }
            }
        }
        return stack2.pop();
    }
}
```
The client code is here
```java
public class ImplementQueueWithTwoStack {
    public static void main(String[] args) {
        StackQueue1 stackQueue = new StackQueue1();
//        StackQueue2 stackQueue = new StackQueue2();
        stackQueue.add(6);
        stackQueue.add(8);
        stackQueue.add(9);
        System.out.println("head item:" + stackQueue.poll());
        stackQueue.add(66);
        stackQueue.add(68);
        stackQueue.add(99);
        System.out.println("head item:" + stackQueue.poll());
        System.out.println("head item:" + stackQueue.poll());
        System.out.println("head item:" + stackQueue.poll());
        System.out.println("head item:" + stackQueue.poll());
        System.out.println("head item:" + stackQueue.poll());
        System.out.println("head item:" + stackQueue.poll());
    }
}
```
The output is here.
```
head item:6
head item:8
head item:9
head item:66
head item:68
head item:99
empty queue
head item:-1
```

EOF