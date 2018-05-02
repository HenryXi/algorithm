package com.henryxi.algorithm.stack.sortstack;

import java.util.Random;
import java.util.Stack;

public class SortStackClient {
    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> originalStack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            originalStack.push(random.nextInt(100));
        }
        System.out.println("original stack:" + originalStack);
        Stack<Integer> orderedStack = sortStack(originalStack);
        System.out.println("ordered  stack:" + orderedStack);
    }

    private static Stack<Integer> sortStack(Stack<Integer> originalStack) {
        Stack<Integer> tempStack = new Stack<>();
        while (true) {
            if (originalStack.isEmpty()) {
                moveAllItemToAnother(tempStack, originalStack);
                return originalStack;
            }
            if (tempStack.isEmpty()) {
                tempStack.push(originalStack.pop());
                continue;
            }
            int current = originalStack.pop();
            int top = tempStack.peek();
            if (current > top) {
                moveAllItemToAnother(tempStack, originalStack);
            }
            tempStack.push(current);
        }
    }

    private static void moveAllItemToAnother(Stack<Integer> fromStack, Stack<Integer> toStack) {
        while (true) {
            if (fromStack.isEmpty()) {
                return;
            }
            toStack.push(fromStack.pop());
        }
    }
}
