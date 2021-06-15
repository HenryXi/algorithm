package com.henryxi.algorithm.array.mergeintervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervalsClient {
    public static void main(String[] args) {
        int[][] arrays = new int[][]{{1, 3}, {8, 10}, {15, 18}, {2, 6}};
        MergeIntervalsClient client = new MergeIntervalsClient();
        arrays = client.ownMerge(arrays);
        for (int[] array : arrays) {
            System.out.println(array[0] + "," + array[1]);
        }
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] array : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < array[0]) {
                merged.add(array);
            } else {
                merged.getLast()[1] = Math.max(array[1], merged.getLast()[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
//todo not finish my own merge method
    public int[][] ownMerge(int[][] intervals) {
        int begin = intervals[0][0];
        int end = intervals[0][1];
        for (int[] array : intervals) {
            begin = Math.min(begin, array[0]);
            end = Math.max(end, array[1]);
        }
        int[] temp = new int[end + 1];
        for (int[] array : intervals) {
            for (int i = array[0]; i <= array[1]; i++) {
                temp[i]++;
            }
        }
        LinkedList<int[]> list = new LinkedList<>();
        for (int i = 0; i < temp.length; i++) {
            if ((temp[i] > 0) && (i == 0 || temp[i - 1] == 0)) {
                int[] arr = new int[2];
                arr[0] = i;
                list.add(arr);
            } else if (temp[i] == 0 && (i == temp.length - 1 || temp[i - 1] == 0)) {
                list.getLast()[1] = i;
            }
        }
        return intervals;
    }
}
