package com.henryxi.algorithm.sort;

public class SelectSort extends AbstractSort {
    @Override
    void sort() {
        int i, j, m, temp;
        start = System.nanoTime();
        for (i = 0; i < MAX - 1; i++) {
            m = i;
            for (j = i + 1; j < MAX; j++) {
                if (number[j] < number[m]) {
                    m = j;
                }
            }
            if (i != m) {
                temp = number[i];
                number[i] = number[m];
                number[m] = temp;
            }
        }
        end = System.nanoTime();
    }

    public static void main(String[] args) {
        SelectSort sort = new SelectSort();
        sort.printInfo();
    }
}
