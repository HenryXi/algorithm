package com.henryxi.algorithm.sort.exercise;

import java.util.Arrays;

public class TestQuickSort {
    static int[] num = new int[20];

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            num[i] = (int) (Math.random() * 100);
        }
        quickSort(num, 0, 19);
        System.out.println(Arrays.toString(num));
    }

    private static void quickSort(int[] intervals, int begin, int end) {
        int p1 = begin;
        int p2 = end;
        int flag = intervals[p1];
        if (p1 < p2) {
            while (true) {
                while (intervals[p1] <=flag && p1 < end) {
                    p1++;
                }
                while (intervals[p2] > flag && p2 > begin) {
                    p2--;
                }
                if (p2<=p1) {
                    break;
                }
                swap(intervals, p1, p2);
            }
            quickSort(intervals, begin, p1 - 1);
            quickSort(intervals, p2 + 1, end);
        }
    }

    private static void swap(int[] intervals, int p1, int p2) {
        if (intervals[p1] == intervals[p2]) {
            return;
        }
        int temp = intervals[p1];
        intervals[p1] = intervals[p2];
        intervals[p2] = temp;
    }

    static void sort(int[] num, int start, int end) {
        int left, right, current, temp;
        if (start < end) {
            current = num[start];
            left = start;
            right = end + 1;
            while (true) {
                while (true) {
                    if (left >= end || num[++left] > current) {
                        break;
                    }
                }
                while (true) {
                    if (right <= start || num[--right] < current) {
                        break;
                    }
                }
                if (left >= right) {
                    break;
                }
                temp = num[left];
                num[left] = num[right];
                num[right] = temp;
            }
            num[start] = num[right];
            num[right] = current;
            System.out.println(Arrays.toString(num));
            sort(num, start, left - 1);
            sort(num, right + 1, end);
        }
    }
}

