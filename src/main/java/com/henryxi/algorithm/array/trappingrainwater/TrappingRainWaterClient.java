package com.henryxi.algorithm.array.trappingrainwater;


public class TrappingRainWaterClient {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(array));
    }

    /**
     * 这个的思路是将所有的区块划分成海，陆，空三个区域，然后从左往右遍历一次，再从由往左一次，在遍历的过程中
     * 减去陆地的值，这样区域的总面积就是2份的水，1份陆地和1份天空。
     * 最后用总区域面积减去矩形面积就是一份水的面积
     *
     */
    public static int trap(int[] height) {
        int h1 = 0;
        int h2 = 0;
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            h1 = Math.max(h1, height[i]);
            h2 = Math.max(h2, height[height.length - i - 1]);
            sum = sum + h1 + h2 - height[i];
        }
        sum = sum - h1 * height.length;
        return sum;
    }

    public static int trapIneffective(int[] height) {
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
        return findMaxHeight(array, 0, i - 1, array[i]);
    }

    private static int getRightMax(int[] array, int i) {
        return findMaxHeight(array, i + 1, array.length - 1, array[i]);
    }


    private static int findMaxHeight(int[] array, int begin, int end, int currentValue) {
        int max = 0;
        for (int i = begin; i <= end; i++) {
            max = Math.max(max, array[i]);
        }
        return Math.max(max, currentValue);
    }
}
