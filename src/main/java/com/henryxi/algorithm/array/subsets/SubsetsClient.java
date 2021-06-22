package com.henryxi.algorithm.array.subsets;

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
}
