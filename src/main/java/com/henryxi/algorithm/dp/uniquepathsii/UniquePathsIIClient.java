package com.henryxi.algorithm.dp.uniquepathsii;

public class UniquePathsIIClient {
    public static void main(String[] args) {
        UniquePathsIIClient client = new UniquePathsIIClient();
        int[][] array = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(client.uniquePathsWithObstacles(array));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] step = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            step[i][0] = 1;
        }
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            step[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                step[i][j] = obstacleGrid[i][j] == 1 ? 0 : step[i - 1][j] + step[i][j - 1];
            }
        }
        return step[n - 1][m - 1];
    }
}
