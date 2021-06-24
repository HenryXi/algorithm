package com.henryxi.algorithm.array.besttimetobuyandsellstockii;

public class BestTimeToBuyAndSellStockIIClient {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                res = prices[i] - prices[i - 1] + res;
            }
        }
        return res;
    }
}
