package com.henryxi.algorithm.array.movezeroes;

import java.util.Arrays;

public class MoveZeroesClient {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 3, 12};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }

    public static void moveZeroes(int[] nums) {
        int newIndex = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != 0) {
                nums[newIndex++] = nums[i];
            }
        }
        while (newIndex < nums.length) {
            nums[newIndex] = 0;
            newIndex++;
        }
    }
}
