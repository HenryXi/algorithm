package com.henryxi.algorithm.array.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FourSumClient {
    public static void main(String[] args) {
        int[] nums = new int[]{1, -2, -5, -4, -3, 3, 3, 5};
        System.out.println(fourSum(nums, -11));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int length = nums.length;
        if (length < 4) {
            return new ArrayList<>();
        }
        if (length == 4 && nums[0] + nums[1] + nums[2] + nums[3] == target) {
            return Collections.singletonList(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
        }
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int L;
        int R;
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < length - 2; j++) {
                int secondTarget = target - nums[i];
                if (j - 1 != i && nums[j] == nums[j - 1]) {
                    continue;
                }
                L = j + 1;
                R = length - 1;

                while (L < R) {
                    int sum = nums[j] + nums[L] + nums[R];
                    if (sum == secondTarget) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[L], nums[R]));
                        while (L < R && nums[L] == nums[L + 1]) {
                            L++;
                        }
                        while (L < R && nums[R] == nums[R - 1]) {
                            R--;
                        }
                        L++;
                        R--;
                    } else if (sum > secondTarget) {
                        R--;
                    } else {
                        L++;
                    }
                }
            }
        }

        return ans;
    }
}
