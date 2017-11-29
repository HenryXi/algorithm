package com.henryxi.algorithm.array;

import java.util.Random;

public class BinarySearchLoop {
    public static void main(String[] args) {
        // index :        0, 1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14
        int srcArray[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};
        int targetIndex = new Random().nextInt(srcArray.length);
        int target = srcArray[targetIndex];
        int index = binSearch(srcArray, target);
        System.out.println("to be found num:" + target + ",index is:" + index);
    }

    private static int binSearch(int[] srcArray, int target) {
        int mid = srcArray.length / 2;
        if (target == srcArray[mid]) {
            return mid;
        }
        int start = 0;
        int end = srcArray.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (target < srcArray[mid]) {
                end = mid - 1;
            } else if (target > srcArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
