package com.henryxi.algorithm.sort;

public class BaseSort extends AbstractSort {

    public static void main(String[] args) {
        BaseSort baseSort = new BaseSort();
        baseSort.printInfo();
    }

    @Override
    void sort() {
        int temp[][] = new int[MAX][MAX];
        int order[] = new int[MAX];
        int i, j, k, n, lsd;
        k = 0;
        n = 1;
        start = System.nanoTime();
        while (n <= 10) {
            for (i = 0; i < MAX; i++) {
                lsd = ((number[i] / n) % 10);
                temp[lsd][order[lsd]] = number[i];
                order[lsd]++;
            }
            //重新排列
            for (i = 0; i < MAX; i++) {
                if (order[i] != 0)
                    for (j = 0; j < order[i]; j++) {
                        number[k] = temp[i][j];
                        k++;
                    }
                order[i] = 0;
            }
            n *= 10;
            k = 0;
        }
        end = System.nanoTime();
    }
}
