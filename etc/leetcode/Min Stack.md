# Min Stack
[Problem Description](https://leetcode.com/problems/min-stack/)

```
class MinStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            int min = Math.min(minStack.peek(),val);
            minStack.push(min);
        }
    }

    public void pop() {
        minStack.pop();
        mainStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 5 ms | 40 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF