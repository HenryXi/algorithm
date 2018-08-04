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
        for (int i = 0; i < numbersArray.length; i++) {
            sorted[numbersArray[i]] = sorted[numbersArray[i]] + 1;
        }
        end = System.nanoTime();
        numbersArray = sorted;
    }

    @Override
    void printAfter() {
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] != 0) {
                do {
                    System.out.print(i + " ");
                    numbersArray[i]--;
                } while (numbersArray[i] > 0);
            }
        }
    }
}
