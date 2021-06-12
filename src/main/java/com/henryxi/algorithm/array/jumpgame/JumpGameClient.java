package com.henryxi.algorithm.array.jumpgame;

public class JumpGameClient {
    public static void main(String[] args) {
        JumpGameClient client = new JumpGameClient();
        int[] array = new int[]{2,3,1,1,4};
        System.out.println(client.canJump(array));
    }

    public boolean canJump(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return true;
        }
        int cur = nums[0];
        int i;
        for (i = 1; i < length && cur > 0; i++) {
            cur--;
            if (nums[i] > cur) {
                cur = nums[i];
            }
        }
        return i == length;
    }
}
