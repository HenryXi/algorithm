package com.henryxi.algorithm.sort;

public class BucketSort extends AbstractSort {
    public static void main(String[] args) {
        BucketSort bucketSort = new BucketSort();
        bucketSort.printInfo();
    }

    @Override
    void sort() {
        start = System.nanoTime();
        int[] sorted = new int[100 + 1];
        for (int i = 0; i < number.length; i++) {
            sorted[number[i]] = sorted[number[i]] + 1;
        }
        end = System.nanoTime();
        number = sorted;
    }

    @Override
    void printAfter() {
        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0) {
                do {
                    System.out.print(i + " ");
                    number[i]--;
                } while (number[i] > 0);
            }
        }
    }
}
