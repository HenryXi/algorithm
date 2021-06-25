package com.henryxi.algorithm.array.longestincreasingsubsequence;

import java.util.Arrays;

public class LongestIncreasingSubsequenceClient {
    public static void main(String[] args) {
        LongestIncreasingSubsequenceClient client = new LongestIncreasingSubsequenceClient();
        int[] array = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(client.lengthOfLIS(array));
    }

    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int index = Arrays.binarySearch(res, 0, len, num);
            index = index < 0 ? -index - 1 : index;
            res[index] = num;
            if (index == len) {
                len++;
            }
        }
        return len;
    }
}
