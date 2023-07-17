package com.henryxi.algorithm.array.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumClient {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer otherIndex = map.get(target - nums[i]);
            if (otherIndex != null && otherIndex > i) {
                return new int[]{i + 1, otherIndex + 1};
            }
        }
        return null;
    }
}
