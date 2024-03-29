package com.henryxi.algorithm.stack.minstack;

import java.util.LinkedList;
import java.util.Stack;

public class MinStackClient {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(6);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }

}

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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
