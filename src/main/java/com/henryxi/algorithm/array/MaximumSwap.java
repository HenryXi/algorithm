package com.henryxi.algorithm.array;

/**
 * https://leetcode-cn.com/problems/maximum-swap/
 */
public class MaximumSwap {
    public static void main(String[] args) {
        int num = 43456;
//        int result = maximumSwap(num);
        int result = mySwap(num);
        System.out.println(result);
    }

    private static int maximumSwap(int num) {
        //find how many nums
        int n = 0;
        int a = num;
        while (a > 0) {
            a = a / 10;
            n++;
        }
        //put nums in array
        int[] nums = new int[n];
        a = num;
        for (int i = 0; i < n; i++) {
            nums[n - i - 1] = a % 10;
            a = a / 10;
        }
        /**
         * 0. find flagIndex
         * 1. find maxIndex(on the right of flagIndex)
         * 2. find targetIndex(on the left of flagIndex)
         * 3. exchange them
         */
        int index = 1;
        //find flagIndex
        while (index < n && nums[index] <= nums[index - 1]) {
            index++;
        }
        if (index == n) {
            return num;
        }
        //find maxIndex
        int max = -1;
        int maxindex = index;
        for (int i = index; i < n; i++) {
            if (max <= nums[i]) {
                max = nums[i];
                maxindex = i;
            }
        }
        //find targetIndex
        for (int i = 0; i < index; i++) {
            if (nums[i] < nums[maxindex]) {
                index = i;
                break;
            }
        }
        //exchange
        int temp = nums[index];
        nums[index] = nums[maxindex];
        nums[maxindex] = temp;
        int ans = 0;
        for (int c : nums) ans = ans * 10 + c;
        return ans;
    }

    private static int mySwap(int num) {
        int n = 0;
        int a = num;
        while (a > 0) {
            a = a / 10;
            n++;
        }
        int[] nums = new int[n];
        a = num;
        for (int i = 0; i < n; i++) {
            nums[n - i - 1] = a % 10;
            a = a / 10;
        }
        int flagIndex = 1;
        while (flagIndex < n && nums[flagIndex] <= nums[flagIndex - 1]) {
            flagIndex++;
        }
        if (flagIndex == n) {
            return num;
        }
        int maxValue = -1;
        int maxIndex = flagIndex;
        for (int i = flagIndex; i < n; i++) {
            if (maxValue <= nums[i]) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        int minIndex = 0;
        for (int i = 0; i < flagIndex; i++) {
            if (nums[maxIndex] > nums[i]) {
                minIndex = i;
                break;
            }
        }
        int temp = nums[minIndex];
        nums[minIndex] = nums[maxIndex];
        nums[maxIndex] = temp;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res * 10 + nums[i];
        }
        return res;
    }
}
