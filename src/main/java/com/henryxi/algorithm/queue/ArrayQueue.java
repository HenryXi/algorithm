package com.henryxi.algorithm.queue;

/**
 * http://blog.csdn.net/xiuweikang/article/details/40400639
 */
public class ArrayQueue {
    private int[] arrInt;
    private int front;
    private int rear;

    public ArrayQueue(int size) {
        this.arrInt = new int[size];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == arrInt.length;
    }

    public boolean isFull() {
        return arrInt.length - 1 == rear;
    }

    public void insert(int item) {
        if (isFull()) {
            throw new RuntimeException("队列已满");
        }
        arrInt[++rear] = item;
    }

    public int peekFront() {
        return arrInt[front];
    }

    public int peekRear() {
        return arrInt[rear];
    }

    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return arrInt[front++];
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        System.out.println(queue.isEmpty());
        for (int i = 0; i < 10; i++) {
            queue.insert(i);
        }
        queue.remove();
        queue.insert(99);
        System.out.println(queue.isFull());
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
