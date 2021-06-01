package com.henryxi.algorithm.array.shuzuzhongzhongfudeshuzilcof;

public class FindRepeatNumberClient {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(array));
    }

    public static int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]!=i){
                if (nums[nums[i]] != nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[temp];
                    nums[temp] = temp;
                } else {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
