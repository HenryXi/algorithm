package com.henryxi.algorithm.array.sortcolors;

import java.util.Arrays;

public class SortColorsClient {
    public static void main(String[] args) {
        SortColorsClient client = new SortColorsClient();
        int[] array = new int[]{2, 0, 2, 1, 1, 2};
        client.sortColors(array);
        System.out.println(Arrays.toString(array));
    }

    public void sortColors(int[] nums) {
        int length = nums.length;
        int p0 = 0;
        int p2 = length - 1;
        for (int i = 0; i <= p2; i++) {
            while (i <= p2 && nums[i] == 2) {
                swap(nums, i, p2);
                p2--;
            }
            if (nums[i] == 0) {
                swap(nums, i, p0);
                p0++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
