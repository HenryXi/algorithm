package com.henryxi.algorithm.array.combinationsumii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumIIClient {
    public static void main(String[] args) {
        int[] nums = new int[]{10, 1, 2, 7, 6, 1, 5};
        CombinationSumIIClient client = new CombinationSumIIClient();
        System.out.println(client.combinationSum2(nums, 8));
    }

    private List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        loopAfter(candidates, target, 0, new ArrayList<>());
        return res;
    }

    private void loopAfter(int[] candidates, int target, int start, ArrayList<Integer> list) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
        }
        for (int i = start; i < candidates.length; i++) {
            if (target < candidates[i]) {
                break;
            }
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            loopAfter(candidates, target - candidates[i], i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
