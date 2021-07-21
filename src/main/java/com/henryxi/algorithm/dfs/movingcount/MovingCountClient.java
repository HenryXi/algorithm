package com.henryxi.algorithm.dfs.movingcount;

public class MovingCountClient {
    public static void main(String[] args) {
        MovingCountClient client = new MovingCountClient();
        System.out.println(client.movingCount(15, 15, 3));
    }

    public int movingCount(int m, int n, int k) {
        int count = 0;
        boolean[][] vis = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (getValue(i, j) <= k) {
                    vis[i][j] = true;
                    count++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j == 0)) {
                    continue;
                }
                if (vis[i][j] && leftFalse(i, j, vis) && upFalse(i, j, vis)) {
                    vis[i][j] = false;
                    count--;
                }
            }
        }
        return count;
    }

    private boolean upFalse(int i, int j, boolean[][] vis) {
        if (j - 1 >= 0) {
            return !vis[i][j - 1];
        }
        return true;
    }

    private boolean leftFalse(int i, int j, boolean[][] vis) {
        if (i - 1 >= 0) {
            return !vis[i - 1][j];
        }
        return true;
    }

    private int getValue(int x, int y) {
        return x / 10 + x % 10 + y / 10 + y % 10;
    }
}
