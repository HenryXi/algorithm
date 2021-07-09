package com.henryxi.algorithm.dfs.movingcount;

//todo not finish.  can not fly to the destination, just move to destination
public class MovingCountClient {
    public static void main(String[] args) {
        MovingCountClient client = new MovingCountClient();
        System.out.println(client.movingCount(16, 8, 4));
    }

    public int movingCount(int m, int n, int k) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (getValue(i, j) <= k) {
                    count++;
                }
            }
        }
        return count;
    }

    private int getValue(int x, int y) {
        return x / 10 + x % 10 + y / 10 + y % 10;
    }
}
