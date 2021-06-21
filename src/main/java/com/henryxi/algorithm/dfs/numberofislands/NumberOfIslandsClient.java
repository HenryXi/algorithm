package com.henryxi.algorithm.dfs.numberofislands;

public class NumberOfIslandsClient {
    public static void main(String[] args) {
        NumberOfIslandsClient client = new NumberOfIslandsClient();
        char[][] grid = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(client.numIslands(grid));
    }

    public int numIslands(char[][] A) {
        int length = A.length;
        int high = A[0].length;
        int res = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < high; j++) {
                res += dfs(A, i, j);
            }
        }
        return res;
    }

    private int dfs(char[][] A, int i, int j) {
        int length = A.length;
        int high = A[0].length;
        if (i < 0 || i == length || j < 0 || j == high || A[i][j] == '0') {
            return 0;
        }
        A[i][j] = '0';
        dfs(A, i - 1, j);
        dfs(A, i + 1, j);
        dfs(A, i, j - 1);
        dfs(A, i, j + 1);
        return 1;
    }
}
