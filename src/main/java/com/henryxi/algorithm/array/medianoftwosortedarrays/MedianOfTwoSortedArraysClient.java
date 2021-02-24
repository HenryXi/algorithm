package com.henryxi.algorithm.array.medianoftwosortedarrays;

/**
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 */
//todo not finish, I can do in this way: O(m+n)
public class MedianOfTwoSortedArraysClient {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
//        NextNumBean nextNum = new NextNumBean(0, 0, -1);
//        int[] nums1 = {1,2};
//        int[] nums2 = {3,4};
//        do {
//            if (nextNum.index1 == nums1.length && nextNum.index2 == nums2.length) {
//                break;
//            }
//            nextNum = getNextNum(nums1, nums2, nextNum.index1, nextNum.index2);
//            System.out.println(nextNum.nextNum);
//        } while (true);
        double middleValue = findMedianSortedArrays(nums1, nums2);
        System.out.println(middleValue);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int targetIndex1 = (nums1.length + nums2.length+1) / 2-1;
        int targetIndex2 = (nums1.length + nums2.length+2) / 2-1;
        int middleNum = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i <=targetIndex1; i++) {
            NextNumBean nextNum = getNextNum(nums1, nums2, index1, index2);
            middleNum = nextNum.nextNum;
            index1 = nextNum.index1;
            index2 = nextNum.index2;
        }
        NextNumBean nextNum = getNextNum(nums1, nums2, index1, index2);
        if (targetIndex1 != targetIndex2) {
            nextNum = getNextNum(nums1, nums2, index1, index2);
            return (middleNum+nextNum.nextNum)/2.0;
        }else{
            return nextNum.nextNum/1.0;
        }
    }

    private static NextNumBean getNextNum(int[] nums1, int[] nums2, int index1, int index2) {
        if (index1 >= nums1.length) {
            int nextNum = nums2[index2];
            index2++;
            return new NextNumBean(index1, index2, nextNum);
        }
        if (index2 >= nums2.length) {
            int nextNum = nums1[index1];
            index1++;
            return new NextNumBean(index1, index2, nextNum);
        }
        int value1 = nums1[index1];
        int value2 = nums2[index2];
        int nextNum = 0;
        if (value1 < value2) {
            index1++;
            nextNum = value1;
        } else {
            index2++;
            nextNum = value2;
        }
        return new NextNumBean(index1, index2, nextNum);
    }
}

class NextNumBean {
    int index1;
    int index2;
    int nextNum;

    public NextNumBean(int index1, int index2, int nextNum) {
        this.index1 = index1;
        this.index2 = index2;
        this.nextNum = nextNum;
    }
}

