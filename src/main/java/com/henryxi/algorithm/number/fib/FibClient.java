package com.henryxi.algorithm.number.fib;
//TODO not finish
public class FibClient {
    public static void main(String[] args) {
        FibClient client = new FibClient();
        System.out.println(client.fib(2));
    }

    public int fib(int n) {
        int mod = 1000000007;
        if (n < 2) {
            return n;
        }
        //0 1 1 2 3 5 8
        int first = 0;
        int second = 0;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            second = result;
            first = second;
            result = first + second;
        }
        return result;
    }
}
