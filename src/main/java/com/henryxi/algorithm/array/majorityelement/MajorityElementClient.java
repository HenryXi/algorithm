package com.henryxi.algorithm.array.majorityelement;

public class MajorityElementClient {
    public static void main(String[] args) {
        MajorityElementClient client = new MajorityElementClient();
        int[] array = new int[]{2, 2, 1, 1, 1, 2, 1};
        System.out.println(client.majorityElement(array));
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        int curVote = 0;
        for (int n : nums) {
            if (count == 0) {
                curVote = n;
            }
            count = count + (curVote == n ? 1 : -1);
        }
        return curVote;
    }
}
