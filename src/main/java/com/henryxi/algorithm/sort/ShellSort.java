package com.henryxi.algorithm.sort;

public class ShellSort extends AbstractSort {
    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        shellSort.printInfo();
    }

    @Override
    void sort() {
        int i, j, k, gap, temp;
        start = System.nanoTime();
        gap = MAX / 2;
        while (gap > 0) {
            for (k = 0; k < gap; k++) {
                for (i = k + gap; i < MAX; i += gap) {
                    for (j = i - gap; j >= k; j -= gap) {
                        if (number[j] > number[j + gap]) {
                            temp = number[j];
                            number[j] = number[j + gap];
                            number[j + gap] = temp;
                        } else {
                            break;
                        }
                    }
                }
            }
            gap /= 2;
        }
        end = System.nanoTime();
    }
}
