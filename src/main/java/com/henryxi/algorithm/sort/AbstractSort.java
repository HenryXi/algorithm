package com.henryxi.algorithm.sort;

abstract class AbstractSort {
    static final int MAX = 20;
    static int numbersArray[] = new int[MAX];
    long start, end;

    AbstractSort() {
        System.out.print("random array：");
        for (int i = 0; i < 20; i++) {
            numbersArray[i] = (int) (Math.random() * 100);
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();
    }

    void printInfo() {
        String sortName = this.getClass().getSimpleName();
        System.out.println("-----------------" + sortName + "------------------");
        sort();
        System.out.print("after sort:");
        printAfter();
        System.out.println();
        System.out.println("time cost：" + (end - start) + " ns");
    }

    void printAfter() {
        for (int i = 0; i <= numbersArray.length - 1; i++) {
            System.out.print(numbersArray[i] + " ");
        }

    }

    abstract void sort();
}
