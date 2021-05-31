package com.henryxi.algorithm.array.plusone;

import java.util.Arrays;

public class PlusOneClient {
    public static void main(String[] args) {
        int[] arrays = new int[]{4, 3, 2, 1};
        System.out.println(Arrays.toString(plusOne(arrays)));
    }

    public static int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        int adder = 1;
        for (int i = lastIndex; i >= 0; i--) {
            digits[i] = digits[i] + adder;
            if (digits[i] == 10) {
                digits[i]=0;
                adder=1;
            }else{
                adder=0;
            }
        }
        if(adder==1){
            int[] res = new int[lastIndex+2];
            res[0]=1;
            return res;
        }
        return digits;
    }
}
