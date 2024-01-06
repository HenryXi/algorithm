package com.henryxi.algorithm.array.spiralmatrixii;

import java.util.Arrays;


public class SpiralMatrixIIClient {
    public static void main(String[] args) {
        SpiralMatrixIIClient client = new SpiralMatrixIIClient();
        int[][] matrix = client.generateMatrix(6);
        for (int[] item : matrix) {
            System.out.println(Arrays.toString(item));
        }
    }

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int row = 0;
        int column = 0;
        int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int directionIndex = 0;
        for (int curNum = 1; curNum <= n * n; curNum++) {
            matrix[row][column] = curNum;
            int nextRow = row + direction[directionIndex][0];
            int nextColumn = column + direction[directionIndex][1];
            if (isChangeDirection(n, nextRow, nextColumn, matrix)) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row = row + direction[directionIndex][0];
            column = column + direction[directionIndex][1];
        }
        return matrix;
    }

    private boolean isChangeDirection(int n, int nextRow, int nextColumn, int[][] matrix) {
        if (nextRow >= n) {
            return true;
        }
        if (nextColumn >= n) {
            return true;
        }
        if (nextRow < 0) {
            return true;
        }
        if (nextColumn < 0) {
            return true;
        }
        if (matrix[nextRow][nextColumn] != 0) {
            return true;
        }

        return false;
    }
//
//    public int[][] generateMatrix(int n) {
//        int maxNum = n * n;
//        int curNum = 1;
//        int[][] matrix = new int[n][n];
//        int row = 0;
//        int column = 0;
//        //left to right:row not change ,column++ , {0,1}
//        //up to bottom:row++,column not change, {1,0}
//        //right to left:row not change,column==,{0,-1}
//        //bottom to up:row--,column not change,{-1,0}
//        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//        int directionIndex = 0;
//        while (curNum <= maxNum) {
//            matrix[row][column] = curNum;
//            curNum++;
//            int nextRow = row + directions[directionIndex][0];
//            int nextColumn = column + directions[directionIndex][1];
//            if (isChangeDirection(n, nextRow, nextColumn, matrix)) {
//                directionIndex = (directionIndex + 1) % 4; // 顺时针旋转至下一个方向
//            }
//            row = row + directions[directionIndex][0];
//            column = column + directions[directionIndex][1];
//        }
//        return matrix;
//    }
//
//    private static boolean isChangeDirection(int n, int nextRow, int nextColumn, int[][] matrix) {
//        return nextRow < 0 || nextRow >= n || nextColumn < 0 || nextColumn >= n || matrix[nextRow][nextColumn] != 0;
//    }

}
