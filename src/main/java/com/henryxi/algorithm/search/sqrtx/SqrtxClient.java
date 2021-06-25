package com.henryxi.algorithm.search.sqrtx;

public class SqrtxClient {
    public static void main(String[] args) {
        SqrtxClient client = new SqrtxClient();
        System.out.println(client.mySqrt(-3));
    }

    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            long tempValue = (long) mid * mid;
            if (tempValue == x) {
                return mid;
            } else if (tempValue < x) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}
