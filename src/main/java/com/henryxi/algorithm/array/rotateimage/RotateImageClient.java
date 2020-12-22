package com.henryxi.algorithm.array.rotateimage;

public class RotateImageClient {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(array);
        System.out.println(array);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>j){
                    swap(matrix,i,j,j,i);
                }
            }
        }

        for (int j = 0; j < n / 2; j++) {
            for (int i = 0; i < n; i++) {
                swap(matrix,i,j,i,n-j-1);
            }
        }
    }

    private static void swap(int[][] matrix, int i, int j, int ii, int jj) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[ii][jj];
        matrix[ii][jj] = temp;
    }
}
