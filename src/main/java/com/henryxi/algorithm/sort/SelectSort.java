package com.henryxi.algorithm.sort;

public class SelectSort extends AbstractSort {
    public static void main(String[] args) {
        SelectSort sort = new SelectSort();
        sort.printInfo();
    }

    @Override
    void sort() {
        int i, j, m, temp;
        start = System.nanoTime();
        for (i = 0; i < NUMBERS_COUNT - 1; i++) {
            m = i;
            for (j = i + 1; j < NUMBERS_COUNT; j++) {
                if (numbersArray[j] < numbersArray[m]) {
                    m = j;
                }
            }
            if (i != m) {
                temp = numbersArray[i];
                numbersArray[i] = numbersArray[m];
                numbersArray[m] = temp;
            }
        }
        end = System.nanoTime();
    }
}
