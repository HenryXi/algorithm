package com.henryxi.algorithm.dp.maximumlengthofrepeatedsubarray;

public class MaximumLengthOfRepeatedSubarrayClient {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 2, 3, 2, 1};
        int[] arrayB = new int[]{3, 2, 1, 4, 7};
        System.out.println(findLength(arrayA, arrayB));
    }

    public static int findLength(int[] nums1, int[] nums2) {
        int aLength = nums1.length;
        int bLength = nums2.length;
        for (int i = 0; i < aLength; i++) {
            for (int j = 0; j < i; j++) {

            }
        }
        return 0;
    }


    private static int findLengthDp(int[] nums1, int[] nums2) {
        int ans = 0;
        int[][] memo = new int[nums1.length + 1][nums2.length + 1];
        for (int i = nums1.length - 1; i >= 0; --i) {
            for (int j = nums2.length - 1; j >= 0; --j) {
                if (nums1[i] == nums2[j]) {
                    memo[i][j] = memo[i + 1][j + 1] + 1;
                    if (ans < memo[i][j]) {
                        ans = memo[i][j];
                    }
                }
            }
        }
        return ans;
    }


}
