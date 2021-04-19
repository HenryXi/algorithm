package com.henryxi.algorithm.array.combinationsum;

import java.util.Arrays;
import java.util.List;
//todo not finish
public class CombinationSumClient {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 6, 7};
        System.out.println(combinationSum(nums, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int endIndex = getEndIndex(candidates, target);
        return combinationSum(candidates, target, endIndex);
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target, int endIndex) {
        for (int i = 0; i <= endIndex; i++) {

        }
    }

    private static int getEndIndex(int[] candidates, int target) {
        int left = 0;
        int right = candidates.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (candidates[mid] == target) {
                return mid;
            }
            if (candidates[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (candidates[left] > target) {
            return left;
        }
        return left + 1;
    }

}
