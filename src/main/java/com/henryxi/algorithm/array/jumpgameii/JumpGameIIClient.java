package com.henryxi.algorithm.array.jumpgameii;

public class JumpGameIIClient {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }

    //todo not finish
    public static int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int reach = 0;
        int nextMaxReach = nums[0];
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
            nextMaxReach = Math.max(i + nums[i], nextMaxReach);
            if (nextMaxReach >= nums.length - 1) {
                return (step + 1);
            }
            if (i == reach) {
                step++;
                reach = nextMaxReach;
            }
        }
        return step;
    }
}
