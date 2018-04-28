package com.henryxi.algorithm.stack.implqueue;

import java.util.Stack;

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
