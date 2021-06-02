package com.henryxi.algorithm.string.stringtointegeratoi;

public class StringToIntegerAtoiClient {
    public static void main(String[] args) {
        System.out.println(myAtoi("9223372036854775808"));
    }

    public static int myAtoi(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }
        s = s.trim();
        char[] chars = s.toCharArray();
        int flag = 1;
        long res = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-' && i == 0) {
                flag = -1;
                continue;
            }
            if (chars[i] == '+' && i == 0) {
                continue;
            }
            if (chars[i] >= '0' && chars[i] <= '9') {
                res = res * 10 + (chars[i]-'0');
            }else{
                break;
            }
            if (res > 2147483647L && flag==1) {
                return Integer.MAX_VALUE;
            }
            if (res >= 2147483648L) {
                return Integer.MIN_VALUE;
            }
        }
        res = res * flag;

        return (int) res;
    }
}
