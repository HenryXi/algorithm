package com.henryxi.algorithm.array.getleastnumbers;

import java.util.Arrays;

public class GetLeastNumbersClient {
    public static void main(String[] args) {
        GetLeastNumbersClient client = new GetLeastNumbersClient();
        int[] array = new int[]{3, 2, 1};
        System.out.println(Arrays.toString(client.getLeastNumbers(array, 2)));
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
