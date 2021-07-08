package com.henryxi.algorithm.number.twosumiiinputarrayissorted;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSortedClient {
    public static void main(String[] args) {
        TwoSumIIInputArrayIsSortedClient client = new TwoSumIIInputArrayIsSortedClient();
        int[] array = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(client.twoSum(array, 9)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] resArray = new int[2];
        int begin = 0;
        int end = numbers.length - 1;
        while (begin <= end) {
            int res = numbers[begin] + numbers[end];
            if (res > target) {
                end--;
                continue;
            }
            if (res < target) {
                begin++;
                continue;
            }
            resArray[0] = begin + 1;
            resArray[1] = end + 1;
            break;
        }
        return resArray;
    }
}
