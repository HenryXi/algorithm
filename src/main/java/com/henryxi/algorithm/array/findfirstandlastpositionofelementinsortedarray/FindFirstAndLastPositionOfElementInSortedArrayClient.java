package com.henryxi.algorithm.array.findfirstandlastpositionofelementinsortedarray;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArrayClient {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2};
        System.out.println(Arrays.toString(searchRange(nums, 3)));
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] result = new int[2];
        result[0] = getBegin(nums, target);
        result[1] = getEnd(nums, target);
        return result;
    }

    private static int getBegin(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (right >= 0 && nums[right] == target) {
            return right;
        }
        return -1;
    }

    private static int getEnd(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2 + 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        if (left <= nums.length - 1 && nums[left] == target) {
            return left;
        }
        return -1;
    }
}
