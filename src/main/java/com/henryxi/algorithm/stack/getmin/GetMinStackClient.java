package com.henryxi.algorithm.stack.getmin;

import java.util.Random;

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
