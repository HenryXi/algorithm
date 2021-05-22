package com.henryxi.algorithm.stack.implementstackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueuesClient {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}

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
