package com.henryxi.algorithm.array.combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//todo not finish
public class CombinationSumClient {
    private List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 5};
        CombinationSumClient client = new CombinationSumClient();
        System.out.println(client.combinationSum(nums, 8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        loopAfter(candidates, target, 0, new ArrayList<>());
        return res;
    }

    private void loopAfter(int[] candidates, int target, int start, ArrayList<Integer> track) {
        if (target == 0) {
            res.add(new ArrayList<>(track));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target < candidates[i]) {
                break;
            }
            track.add(candidates[i]);
            loopAfter(candidates, target - candidates[i], i, track);
            track.remove(track.size() - 1);
        }
    }
}
