package com.henryxi.algorithm.array.containerwithmostwater;

public class ContainerWithMostWaterClient {
    public static void main(String[] args) {
        int[] heights = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            area = Math.max(area, h * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
}
