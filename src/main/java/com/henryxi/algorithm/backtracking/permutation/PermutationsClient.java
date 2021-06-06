package com.henryxi.algorithm.backtracking.permutation;

import java.util.LinkedList;
import java.util.List;

public class PermutationsClient {
    public static void main(String[] args) {
        int[] arrays = new int[]{1, 2, 3};
        System.out.println(permute(arrays));
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new LinkedList<>();
        permute(nums, 0, l);
        return l;
    }

    private static void permute(int[] nums, int p, List<List<Integer>> l) {
        if (p + 1 == nums.length) {
            List<Integer> ll = new LinkedList<>();
            for (int num : nums) {
                ll.add(num);
            }
            l.add(ll);
            return;
        }
        for (int i = p; i < nums.length; i++) {
            swap(nums, p, i);
            permute(nums, p + 1, l);
            swap(nums, p, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
