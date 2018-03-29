package com.henryxi.algorithm.interview;

public class FibonacciByRecursionClient {
    public static void main(String[] args) {
        System.out.println(getFibonacci(4));
    }

    private static int getFibonacci(int index) {
        if (index <= 0) {
            return -1;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        return getFibonacci(index - 2) + getFibonacci(index - 1);
    }
}
