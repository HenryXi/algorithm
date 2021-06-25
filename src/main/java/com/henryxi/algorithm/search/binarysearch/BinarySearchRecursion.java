package com.henryxi.algorithm.search.binarysearch;

import java.util.Random;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        // index :        0, 1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14
        int srcArray[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};
        int targetIndex = new Random().nextInt(srcArray.length);
        int target = srcArray[targetIndex];
        int index = binSearch(srcArray, 0, srcArray.length - 1, target);
        System.out.println("to be found num:" + target + ",index is:" + index);
    }

    private static int binSearch(int srcArray[], int start, int end, int key) {
        int mid = (end - start) / 2 + start;
        if (srcArray[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, start, mid - 1, key);
        }
        return -1;
    }
}
