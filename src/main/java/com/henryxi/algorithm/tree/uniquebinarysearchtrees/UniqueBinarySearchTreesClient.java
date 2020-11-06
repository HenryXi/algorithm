package com.henryxi.algorithm.tree.uniquebinarysearchtrees;

public class UniqueBinarySearchTreesClient {
    public static void main(String[] args) {
        System.out.println(numTreesRecursion(3));
        System.out.println(numTreesDP(3));
    }

    public static int numTreesRecursion(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = res + numTreesRecursion(i - 1) * numTreesRecursion(n - i);
        }
        return res;
    }

    public static int numTreesDP(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = dp[i] + dp[j - 1] * dp[(i - j)];
            }
        }
        return dp[n];
    }
}
