package com.henryxi.algorithm.sort;

public class InsertionSort extends AbstractSort {
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        sort.printInfo();
    }

    @Override
    void sort() {
        int i, j, temp;
        start = System.nanoTime();
        for (j = 1; j < NUMBERS_COUNT; j++) {
            temp = numbersArray[j];
            i = j - 1;
            while (temp < numbersArray[i]) {
                numbersArray[i + 1] = numbersArray[i];
                i--;
                if (i == -1) {
                    break;
                }
            }
            numbersArray[i + 1] = temp;
        }
        end = System.nanoTime();
    }
}
