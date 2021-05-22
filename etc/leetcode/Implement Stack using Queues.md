# Implement Stack using Queues
[Problem Description]()

```
class MyStack {
    private Queue<Integer> usingQueue = new LinkedList<>();
    private Queue<Integer> emptyQueue = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        usingQueue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        while (usingQueue.size() != 1) {
            emptyQueue.add(usingQueue.poll());
        }
        Integer result = usingQueue.poll();
        Queue<Integer> tmp = usingQueue;
        usingQueue = emptyQueue;
        emptyQueue = tmp;
        return result;
    }

    /**
     * Get the top element.
     */
    public int top() {
        int result = 0;
        while (usingQueue.size() != 0) {
            result = usingQueue.poll();
            emptyQueue.add(result);
        }
        Queue<Integer> tmp = usingQueue;
        usingQueue = emptyQueue;
        emptyQueue = tmp;
        return result;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return usingQueue.size() == 0;
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF