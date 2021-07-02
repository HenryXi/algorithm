package com.henryxi.algorithm.dp.coinchange;

import java.util.Arrays;

//todo not finish
public class CoinChangeClient {
    public static void main(String[] args) {
        CoinChangeClient client = new CoinChangeClient();
        System.out.println(client.coinChange(new int[]{1, 2, 5}, 11));
    }

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (amount == 0) {
                return count;
            }
            if (amount < coins[i]) {
                return -1;
            }
            count = count + (amount / coins[i]);
            amount = amount % coins[i];
        }
        return count;
    }
}
