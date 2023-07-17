package com.henryxi.algorithm.array.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArrayClientII {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int newArrIndex = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[newArrIndex - 2]) {
                nums[newArrIndex] = nums[i];
                newArrIndex++;
            }
        }
        return newArrIndex;
    }
}

