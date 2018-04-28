package com.henryxi.algorithm.stack.implqueue;

public class ImplementQueueWithTwoStack {
    public static void main(String[] args) {
        StackQueue1 stackQueue = new StackQueue1();
//        StackQueue2 stackQueue = new StackQueue2();
        stackQueue.add(6);
        stackQueue.add(8);
        stackQueue.add(9);
        System.out.println("head item:" + stackQueue.poll());
        stackQueue.add(66);
        stackQueue.add(68);
        stackQueue.add(99);
        System.out.println("head item:" + stackQueue.poll());
        System.out.println("head item:" + stackQueue.poll());
        System.out.println("head item:" + stackQueue.poll());
        System.out.println("head item:" + stackQueue.poll());
        System.out.println("head item:" + stackQueue.poll());
        System.out.println("head item:" + stackQueue.poll());
    }
}
