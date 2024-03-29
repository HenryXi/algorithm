package com.henryxi.algorithm.array.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArrayClient {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int newArrIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[newArrIndex - 1]) {
                nums[newArrIndex] = nums[i];
                newArrIndex++;
            }
        }
        return newArrIndex;
    }
}

