package com.henryxi.algorithm.array.searchinrotatedsortedarray;

public class SearchInRotatedSortedArrayClient {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midIndex = (left + right) / 2;
            if (nums[midIndex] == target) {
                return midIndex;
            }
            if (nums[midIndex] < nums[right]) {
                if (nums[midIndex] < target && nums[right] >= target) {
                    left = midIndex + 1;
                } else {
                    right = midIndex - 1;
                }
            } else {
                if (nums[left] <= target && nums[midIndex] > target) {
                    right = midIndex - 1;
                } else {
                    left = midIndex + 1;
                }
            }
        }
        return -1;
    }
}
