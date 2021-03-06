package com.henryxi.algorithm.stack.getmin;

import java.util.Stack;

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
