package com.henryxi.algorithm.string.implementstrstr;

public class ImplementStrStrClient {
    public static void main(String[] args) {
        System.out.println(strStr("aaa", "aaaa"));
    }

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (isSameAfter(haystack, needle, i)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isSameAfter(String haystack, String needle, int begin) {
        for (int i = 0; i < needle.length(); i++) {
            if (haystack.charAt(begin + i) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
