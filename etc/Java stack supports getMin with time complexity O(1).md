# Java stack supports getMin with time complexity O(1)
**Question**: Design a stack supports all stack operations and an extra function `getMin()` which can get the min element 
of the stack. The time complexity of all operations above must be O(1).

There are two ways to implement this stack. The time complexity of them are both O(1).

**Solution 1**
```java
public class GetMinStack1 {
    private Stack<Integer> minStack = new Stack<>();
    private Stack<Integer> dataStack = new Stack<>();

    public Integer getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }

    public void push(int i) {
        dataStack.push(i);
        if (minStack.isEmpty()) {
            minStack.push(i);
            return;
        }
        int top = minStack.peek();
        if (i <= top) {
            minStack.push(i);
        }
    }

    public int pop() {
        Integer dataTop = dataStack.pop();
        Integer minTop = minStack.peek();
        if (dataTop > minTop) {
            return dataTop;
        }
        return minStack.pop();
    }

    @Override
    public String toString() {
        return dataStack.toString();
    }
}
```
**Solution 2**
```java
public class GetMinStack2 {
    private Stack<Integer> minStack = new Stack<>();
    private Stack<Integer> dataStack = new Stack<>();

    public Integer getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }

    public void push(int i) {
        dataStack.push(i);
        if (minStack.isEmpty()) {
            minStack.push(i);
            return;
        }
        int top = minStack.peek();
        if (i <= top) {
            minStack.push(i);
        } else {
            minStack.push(getMin());
        }
    }

    public int pop() {
        dataStack.pop();
        return minStack.pop();
    }

    @Override
    public String toString() {
        return dataStack.toString();
    }
}
```
The code of client is here.
```java
public class GetMinStackClient {
    public static void main(String[] args) {
        Random random = new Random();
//        GetMinStack1 getMinStack = new GetMinStack1();
        GetMinStack2 getMinStack = new GetMinStack2();
        for (int i = 0; i < 10; i++) {
            int tobePushedItem = random.nextInt(10);
            System.out.println("tobe pushed item:" + tobePushedItem);
            getMinStack.push(tobePushedItem);
            System.out.println("current items:" + getMinStack);
            Integer minItem = getMinStack.getMin();
            System.out.println("min item:" + minItem);
        }
        for (int i = 0; i < 10; i++) {
            int pop = getMinStack.pop();
            System.out.println("pop item:" + pop);
            System.out.println("current items:" + getMinStack);
            System.out.println("min item:" + getMinStack.getMin());
        }
    }
}
```
The output is like following.
```
tobe pushed item:3
current items:[3]
min item:3
tobe pushed item:2
current items:[3, 2]
min item:2
tobe pushed item:9
current items:[3, 2, 9]
min item:2
tobe pushed item:6
current items:[3, 2, 9, 6]
min item:2
tobe pushed item:5
current items:[3, 2, 9, 6, 5]
min item:2
tobe pushed item:7
current items:[3, 2, 9, 6, 5, 7]
min item:2
tobe pushed item:1
current items:[3, 2, 9, 6, 5, 7, 1]
min item:1
tobe pushed item:5
current items:[3, 2, 9, 6, 5, 7, 1, 5]
min item:1
tobe pushed item:3
current items:[3, 2, 9, 6, 5, 7, 1, 5, 3]
min item:1
tobe pushed item:5
current items:[3, 2, 9, 6, 5, 7, 1, 5, 3, 5]
min item:1
pop item:1
current items:[3, 2, 9, 6, 5, 7, 1, 5, 3]
min item:1
pop item:1
current items:[3, 2, 9, 6, 5, 7, 1, 5]
min item:1
pop item:1
current items:[3, 2, 9, 6, 5, 7, 1]
min item:1
pop item:1
current items:[3, 2, 9, 6, 5, 7]
min item:2
pop item:2
current items:[3, 2, 9, 6, 5]
min item:2
pop item:2
current items:[3, 2, 9, 6]
min item:2
pop item:2
current items:[3, 2, 9]
min item:2
pop item:2
current items:[3, 2]
min item:2
pop item:2
current items:[3]
min item:3
pop item:3
current items:[]
min item:-1
```
EOF