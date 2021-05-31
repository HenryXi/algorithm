package com.henryxi.algorithm.string.longestcommonprefix;

public class LongestCommonPrefixClient {
    public static void main(String[] args) {
        String[] array = new String[]{"", "flow", "flight"};
        System.out.println(longestCommonPrefix(array));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String base = strs[0];
        for (String str : strs) {
            while (!str.startsWith(base)) {
                base = base.substring(0, base.length() - 1);
            }
        }
        return base;
    }
}
