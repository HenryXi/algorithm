package com.henryxi.algorithm.bit.singlenumber;

public class SingleNumberClient {
    public static void main(String[] args) {
        SingleNumberClient client = new SingleNumberClient();
        int[] array = new int[]{2, 2, 1};
        System.out.println(client.singleNumber(array));
    }

    public int singleNumber(int[] nums) {
        int a = 0;
        for (int n : nums) {
            a = a ^ n;
        }
        return a;
    }
}
