package com.henryxi.algorithm.sort;

abstract class AbstractSort {
    static final int MAX = 20;
    static int number[] = new int[MAX];
    long start, end;

    AbstractSort() {
        System.out.print("random array：");
        for (int i = 0; i < 20; i++) {
            number[i] = (int) (Math.random() * 100);
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    void printInfo() {
        String sortName = this.getClass().getSimpleName();
        System.out.println("-----------------" + sortName + "------------------");
        sort();
        System.out.print("after sort:");
        printAfter();
    }

    void printAfter() {
        for (int i = 0; i <= number.length - 1; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.println("time cost：" + (end - start) + " ns");
    }

    abstract void sort();
}
