package com.henryxi.algorithm.array.thirdmaximumnumber;

import java.util.TreeSet;

public class ThirdMaximumNumberClient {
    public static void main(String[] args) {
        ThirdMaximumNumberClient client = new ThirdMaximumNumberClient();
        System.out.println(client.thirdMax(new int[]{1, 2, 3}));
    }

    public int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
            if (treeSet.size() > 3) {
                treeSet.remove(treeSet.first());
            }
        }
        return treeSet.size() == 3 ? treeSet.first() : treeSet.last();
    }
}
