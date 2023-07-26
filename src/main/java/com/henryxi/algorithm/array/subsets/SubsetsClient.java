package com.henryxi.algorithm.array.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubsetsClient {
    public static void main(String[] args) {
        SubsetsClient client = new SubsetsClient();
        int[] array = new int[]{1, 2, 3};
        System.out.println(client.subsets(array));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        res.add(new LinkedList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> temp = new LinkedList<>(res.get(j));
                temp.add(nums[i]);
                res.add(temp);
            }
        }
        return res;
    }

    public List<List<Integer>> subsets2(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, nums.length); i++) {
            ArrayList<Integer> subSet = new ArrayList<>();
            int index = i;
            for (int j = 0; j < nums.length; j++) {
                if ((index & 1) == 1) {
                    subSet.add(nums[j]);
                }
                index >>= 1;
            }
            res.add(subSet);
        }
        return res;
    }

}
