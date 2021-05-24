package com.henryxi.algorithm.number.palindromenumber;

public class PalindromeNumberClient {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int origin = x;
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int) n == origin;
    }
}
