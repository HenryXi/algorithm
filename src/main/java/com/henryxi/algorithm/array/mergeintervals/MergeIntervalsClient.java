package com.henryxi.algorithm.array.mergeintervals;

import java.util.Stack;

public class MergeIntervalsClient {
    public static void main(String[] args) {
        int[][] arrays = new int[][]{{1, 3}, {8, 10}, {15, 18}, {2, 6}};
        arrays = merge(arrays);
        for (int[] array : arrays) {
            System.out.println(array[0] + "," + array[1]);
        }
    }

    public static int[][] merge(int[][] intervals) {
//        quickSort(intervals, 0, intervals.length - 1);
        Stack<int[]> stack = new Stack<>();
        for (int[] array : intervals) {
            if (stack.isEmpty()) {
                stack.push(array);
                continue;
            }
            int[] cur = stack.pop();
            if (cur[1] > array[0]) {
                cur[1] = array[1];
                stack.push(cur);
            } else {
                stack.push(cur);
                stack.push(array);
            }
        }
        int[][] res = new int[stack.size()][2];
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                break;
            }
            int[] last = stack.pop();
            res[i] = last;
        }
        return res;
    }

    private static void sort(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][0] > intervals[j][0]) {
                    int[] temp = intervals[i];
                    intervals[i] = intervals[j];
                    intervals[j] = temp;
                }
            }
        }
    }

    //TODO not finish(I can't write quick sort now!)
    private static void quickSort(int[][] intervals, int p1, int p2) {
        int begin = p1;
        int end = p2;
        int flag = intervals[p1][0];
        if (p1 < p2) {
            while (true) {
                while (intervals[++p1][0] < flag && p1 < end) ;
                while (intervals[--p2][0] > flag && p2 > begin);
                if (p1 >= p2) {
                    break;
                }
                swap(intervals, p1, p2);
            }
            quickSort(intervals, begin, p1-1);
            quickSort(intervals, p2+1, end);
        }
    }

    private static void swap(int[][] intervals, int p1, int p2) {
        if (intervals[p1][0] == intervals[p2][0]) {
            return;
        }
        int[] temp = intervals[p1];
        intervals[p1] = intervals[p2];
        intervals[p2] = temp;
    }
}
