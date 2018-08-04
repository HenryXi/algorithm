package com.henryxi.algorithm.sort;

public class BucketSort2 extends AbstractSort {
    public static void main(String[] args) {
        BucketSort2 bucketSort = new BucketSort2();
        bucketSort.printInfo();
    }

    @Override
    void sort() {
        start = System.nanoTime();
        Item[] items = new Item[NUMBERS_COUNT];
        for (int i : numbersArray) {
            int index = i * NUMBERS_COUNT / (99 + 1);
            Item item = items[index];
            if (item.isEmpty()){
                item.setValue(i);
            }else{

            }
        }
        end = System.nanoTime();

    }

    @Override
    void printAfter() {

    }
}

class Item {
    private Item next;
    private int value = -1;

    public Item(Item next, int value) {
        this.next = next;
        this.value = value;
    }

    public Item(int value) {
        this.value = value;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == -1;
    }
}

