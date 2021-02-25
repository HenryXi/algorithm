package com.henryxi.algorithm.array.threesum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//TODO not finish
public class ThreeSumClient {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(Integer[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        for (int i = nums.length-1; i >= 0; i--) {

        }
        return list;
    }
}
