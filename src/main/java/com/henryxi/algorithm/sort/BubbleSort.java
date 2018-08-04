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
        for (i = 0; i < NUMBERS_COUNT - 1 && flag == 1; i++) {
            flag = 0;
            for (j = 0; j < NUMBERS_COUNT - i - 1; j++) {
                if (numbersArray[j + 1] < numbersArray[j]) {
                    temp = numbersArray[j + 1];
                    numbersArray[j + 1] = numbersArray[j];
                    numbersArray[j] = temp;
                    flag = 1;
                }
            }
        }
        end = System.nanoTime();
    }
}
