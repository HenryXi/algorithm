package com.henryxi.algorithm.string.reversestring;

import java.util.Arrays;

public class ReverseStringClient {
    public static void main(String[] args) {
        ReverseStringClient client = new ReverseStringClient();
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        client.reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }

    public void reverseString(char[] s) {
        int p1 = 0;
        int p2 = s.length - 1;
        while (p1 <= p2) {
            swap(s, p1, p2);
            p1++;
            p2--;
        }
    }

    private void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
