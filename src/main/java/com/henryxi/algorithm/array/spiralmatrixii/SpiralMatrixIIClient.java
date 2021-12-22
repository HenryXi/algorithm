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
        // 上面到边或者上面有数
        if ((x == 0 || matrix[x - 1][y] != 0) && y < matrix.length - 1 && matrix[x][y + 1] == 0) {
            return y + 1;
        }
        //下面到边或者下面有数
        if ((x == matrix.length - 1 || matrix[x + 1][y] != 0) && y >0 && matrix[x][y - 1] == 0) {
            return y - 1;
        }
        return y;
    }

    private int getNextX(int[][] matrix, int x, int y) {
        //左边到边或者左边有数
        if ((y==0 || matrix[x][y-1]!=0) && y < matrix.length - 1  ) {
            return x-1;
        }
        //右边到边或者右边有数
        if (x <= matrix.length - 1) {
            return x + 1;
        }
        return x;
    }
}
