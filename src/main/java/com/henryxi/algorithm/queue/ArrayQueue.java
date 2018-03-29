package com.henryxi.algorithm.queue;

/**
 * http://blog.csdn.net/xiuweikang/article/details/40400639
 */
public class ArrayQueue<T> {
    private T[] arrInt;
    private int front;
    private int rear;

    public ArrayQueue(int size) {
        this.arrInt = (T[]) new Object[size];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == arrInt.length;
    }

    public boolean isFull() {
        return arrInt.length - 1 == rear;
    }

    public void insert(T item) {
        if (isFull()) {
            throw new RuntimeException("queue full!");
        }
        arrInt[++rear] = item;
    }

    public T peekFront() {
        return arrInt[front];
    }

    public T peekRear() {
        return arrInt[rear];
    }

    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("empty queue!");
        }
        return arrInt[front++];
    }
}
