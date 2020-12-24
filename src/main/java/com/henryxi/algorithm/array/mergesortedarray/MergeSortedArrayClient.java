package com.henryxi.algorithm.array.mergesortedarray;

import java.util.Arrays;

public class MergeSortedArrayClient {
    public static void main(String[] args) {
        int[] array1 = new int[6];
        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 6;
        int[] array2 = new int[]{2, 4, 5};
        merge(array1, 3, array2, 3);
        System.out.println(Arrays.toString(array1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int indexNew = m + n - 1;
        int lastItem = -1;
        do {
            if (indexNew < 0) {
                break;
            }
            if (index1 >= 0 && index2 >= 0) {
                if (nums1[index1] > nums2[index2]) {
                    lastItem = nums1[index1];
                    index1--;
                } else {
                    lastItem = nums2[index2];
                    index2--;
                }
            } else {
                if (index1 < 0) {
                    lastItem = nums2[index2];
                    index2--;
                } else {
                    lastItem = nums1[index1];
                    index1--;
                }
            }
            nums1[indexNew--] = lastItem;
        } while (true);
    }
}
