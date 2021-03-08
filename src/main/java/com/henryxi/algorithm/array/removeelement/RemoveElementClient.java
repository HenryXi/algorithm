package com.henryxi.algorithm.array.removeelement;

public class RemoveElementClient {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                j++;
            } else {
                nums[i - j] = nums[i];
            }
        }
        return nums.length - j;
    }
}
