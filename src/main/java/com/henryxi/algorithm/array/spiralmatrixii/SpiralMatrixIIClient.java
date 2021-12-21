package com.henryxi.algorithm.array.spiralmatrixii;

import java.util.Arrays;


public class SpiralMatrixIIClient {
    public static void main(String[] args) {
        SpiralMatrixIIClient client = new SpiralMatrixIIClient();
        int[][] matrix = client.generateMatrix(3);
        for (int[] item : matrix) {
            System.out.println(Arrays.toString(item));
        }
    }

    public int[][] generateMatrix(int n) {
        int x = 0;
        int y = 0;
        int value = 1;
        int[][] matrix = new int[n][n];
        while (value <= n * n) {
            matrix[x][y] = value;
            x = getNextX(matrix, x, y);
            y = getNextY(matrix, x, y);
            value++;
        }
        return matrix;
    }

    //todo 数组套用xy真傻比
    private int getNextY(int[][] matrix, int x, int y) {
        if (y < matrix.length - 1) {
            return y + 1;
        }
        if (x < matrix.length - 1) {
            return y;
        }
        return ;

    }

    private int getNextX(int[][] matrix, int x, int y) {
        if (y < matrix.length - 1) {
            return x;
        }
        if (x <= matrix.length - 1) {
            return x + 1;
        }
        return -1;
    }
}
