package com.henryxi.algorithm.array.findcontinuoussequence;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindContinuousSequenceClient {
    public static void main(String[] args) {
        FindContinuousSequenceClient client = new FindContinuousSequenceClient();
        System.out.println(Arrays.deepToString(client.findContinuousSequence(9)));
    }

    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new LinkedList<>();
        int left = 1;
        int right = 2;
        while (left < right) {
            int countOfNum = right - left + 1;
            int sum = (left + right) * countOfNum / 2;
            if (sum == target) {
                int[] seq = new int[countOfNum];
                for (int i = 0; i < seq.length; i++) {
                    seq[i] = left + i;
                }
                res.add(seq);
                left++;
            } else if (sum > target) {
                left++;
            } else {
                right++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
