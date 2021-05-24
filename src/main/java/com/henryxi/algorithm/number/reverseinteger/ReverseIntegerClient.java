package com.henryxi.algorithm.number.reverseinteger;

public class ReverseIntegerClient {
    public static void main(String[] args) {
        System.out.println(reverse(321));
    }

    public static int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int) n == n ? (int) n : 0;
    }
}
