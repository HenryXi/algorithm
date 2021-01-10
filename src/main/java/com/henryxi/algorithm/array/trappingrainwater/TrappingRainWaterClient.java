package com.henryxi.algorithm.array.trappingrainwater;


public class TrappingRainWaterClient {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(array));
    }
//todo not finish(should use more effective way
    public static int trap(int[] height) {
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            int currentSum = getCurrentSum(height, i);
            System.out.println("index:" + i + ",value:" + currentSum);
            sum = sum + currentSum;
        }
        return sum;
    }

    private static int getCurrentSum(int[] array, int i) {
        int leftHeight = getLeftMax(array, i);
        if (leftHeight <= 0) {
            return 0;
        }
        int rightHeight = getRightMax(array, i);
        if (rightHeight <= 0) {
            return 0;
        }
        int min = Math.min(leftHeight, rightHeight);
        return min - array[i];
    }

    private static int getLeftMax(int[] array, int i) {
        return findMaxHeight(array, 0, i - 1,array[i]);
    }

    private static int getRightMax(int[] array, int i) {
        return findMaxHeight(array, i + 1, array.length - 1,array[i]);
    }


    private static int findMaxHeight(int[] array, int begin, int end,int currentValue) {
        int max = 0;
        for (int i = begin; i <= end; i++) {
            max = Math.max(max, array[i]);
        }
        return Math.max(max,currentValue);
    }
}
