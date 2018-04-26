package com.henryxi.algorithm.stack.reverse;

import java.util.Random;
import java.util.Stack;

public class ReverseStackClient {
    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(random.nextInt(10));
        }
        System.out.println("current stack:" + stack);
        System.out.println("reverse");
        reverse(stack);
        System.out.println("current stack:" + stack);
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int last = popBottom(stack);
        reverse(stack);
        stack.push(last);
    }

    public static int popBottom(Stack<Integer> stack) {
        Integer top = stack.pop();
        if (stack.isEmpty()) {
            return top;
        } else {
            int last = popBottom(stack);
            stack.push(top);
            return last;
        }
    }
}
