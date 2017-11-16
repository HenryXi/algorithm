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
        for (j = 1; j < MAX; j++) {
            temp = number[j];
            i = j - 1;
            while (temp < number[i]) {
                number[i + 1] = number[i];
                i--;
                if (i == -1) {
                    break;
                }
            }
            number[i + 1] = temp;
        }
        end = System.nanoTime();
    }
}
