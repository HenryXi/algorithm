package com.henryxi.algorithm.array.threesumclosest;

import java.util.Arrays;

public class ThreeSumClosestClient {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 1, -3};
        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int L;
        int R;
        int minGap = Integer.MAX_VALUE;
        boolean isBiggerThanZero = false;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            L = i + 1;
            R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                int gap = sum - target;
                if (gap == 0) {
                    return sum;
                } else if (gap > 0) {
                    if(gap<minGap){
                        minGap=gap;
                        isBiggerThanZero = true;
                    }
                    R--;
                } else {
                    if(-gap<minGap){
                        minGap=-gap;
                        isBiggerThanZero = false;
                    }
                    L++;
                }
            }
        }
        if (isBiggerThanZero) {
            return minGap + target;
        } else {
            return -minGap + target;
        }
    }
}
