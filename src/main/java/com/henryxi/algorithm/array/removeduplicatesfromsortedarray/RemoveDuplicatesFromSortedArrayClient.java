package com.henryxi.algorithm.array.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArrayClient {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                j++;
            } else {
                nums[i - j] = nums[i];
            }
        }
        return nums.length - j;
    }
}

