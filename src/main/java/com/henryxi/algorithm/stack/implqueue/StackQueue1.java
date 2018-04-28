package com.henryxi.algorithm.stack.implqueue;

import java.util.Stack;

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
