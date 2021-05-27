package com.henryxi.algorithm.string.longestcommonprefix;

public class LongestCommonPrefixClient {
    public static void main(String[] args) {
        String[] array = new String[]{"flower", "flow", "flight"};
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                //todo not finish
            }
        }
        return "";
    }
}
