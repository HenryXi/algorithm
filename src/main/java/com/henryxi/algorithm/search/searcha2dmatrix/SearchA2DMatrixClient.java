package com.henryxi.algorithm.search.searcha2dmatrix;
//todo not finish
public class SearchA2DMatrixClient {
    public static void main(String[] args) {
        SearchA2DMatrixClient client = new SearchA2DMatrixClient();
        int[][] arrays = new int[][]{{1, 1}};
        System.out.println(client.searchMatrix(arrays, 13));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int value = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if (value == target) {
                return true;
            }
            if (value > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
