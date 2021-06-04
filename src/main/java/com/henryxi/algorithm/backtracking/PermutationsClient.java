package com.henryxi.algorithm.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//todo not finish
public class PermutationsClient {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        List<List<Integer>> result = permute(array);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        int length = nums.length;
        int totalSize = 1;
        for (int i = 1; i <= length; i++) {
            totalSize = totalSize * i;
        }
        int step = totalSize / length;
        List<List<Integer>> result = new ArrayList<>(totalSize);
        for (int i = 0; i < totalSize; i++) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        }
        int startIndex = 0;
        for (int num : nums) {
            int loopTimes = 0;
            for (List<Integer> list : result) {
                list.set(startIndex%, num);
                loopTimes++;
                if (loopTimes == step) {
                    startIndex++;
                    loopTimes = 0;
                }
            }
        }
        return result;
    }
}
