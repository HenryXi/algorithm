package com.henryxi.algorithm.sort;

public class BubbleSort extends AbstractSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.printInfo();
    }

    @Override
    void sort() {
        int i, j, temp, flag = 1;
        start = System.nanoTime();
        for (i = 0; i < MAX - 1 && flag == 1; i++) {
            flag = 0;
            for (j = 0; j < MAX - i - 1; j++) {
                if (number[j + 1] < number[j]) {
                    temp = number[j + 1];
                    number[j + 1] = number[j];
                    number[j] = temp;
                    flag = 1;
                }
            }
        }
        end = System.nanoTime();
    }
}
