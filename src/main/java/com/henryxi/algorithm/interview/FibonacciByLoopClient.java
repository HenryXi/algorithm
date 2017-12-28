package com.henryxi.algorithm.interview;

public class FibonacciByLoopClient {
    public static void main(String[] args) {
        System.out.println(getFibonacci(17));
    }

    public static int getFibonacci(int index) {
        if (index <= 0) {
            return -1;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        //1 1 2 3 5 8 13 21 34 55
        //1 2 3 4 5 6 7  8  9  10
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i < index; i++) {
            c = a + b;
            if (i == index - 1) {
                break;
            }
            a = b;
            b = c;
        }
        return c;
    }
}
