package com.henryxi.algorithm.array.mergeintervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervalsClient {
    public static void main(String[] args) {
        int[][] arrays = new int[][]{{1, 4}, {5, 6}};
        MergeIntervalsClient client = new MergeIntervalsClient();
        arrays = client.merge(arrays);
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
}
