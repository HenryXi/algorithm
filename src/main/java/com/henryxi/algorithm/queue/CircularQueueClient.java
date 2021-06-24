package com.henryxi.algorithm.queue;

/**
 * https://leetcode-cn.com/problems/design-circular-queue/
 */
public class CircularQueueClient {
    private Integer[] arr;
    private int head;
    private int tail;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public CircularQueueClient(int k) {
        arr = new Integer[k];
        head = 0;
        tail = 0;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else {
            arr[tail] = value;
            tail = (tail + 1) % (arr.length);
            return true;
        }

    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        } else {
            arr[head] = null;
            head = (head + 1) % (arr.length);
            return true;
        }
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        } else {
            return arr[head];
        }
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        } else {
            if (tail != 0) return arr[tail - 1];
            else return arr[arr.length - 1];
        }
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        if (head == tail && arr[head] == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        if (head == tail && arr[head] != null) {
            return true;
        } else {
            return false;
        }
    }
}

class MyCircularQueue {
    private Integer[] queue;
    private int head;
    private int tail;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        queue = new Integer[k];
        head = 0;
        tail = 0;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        queue[tail] = value;
        tail = (tail + 1) % queue.length;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        queue[head] = null;
        head = (head + 1) % queue.length;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[head];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        int index = (tail + queue.length - 1) % queue.length;
        return queue[index];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        if (head == tail && queue[head] == null) {
            return true;
        }
        return false;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        if (head == tail && queue[head] != null) {
            return true;
        }
        return false;
    }
}
