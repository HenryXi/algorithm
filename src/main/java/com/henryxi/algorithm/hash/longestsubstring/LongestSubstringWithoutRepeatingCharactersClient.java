package com.henryxi.algorithm.hash.longestsubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharactersClient {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(myLengthOfLongestSubString(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }

    public static int myLengthOfLongestSubString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer lastIndex = map.get(c);
            map.put(c, i);
            if (lastIndex != null && lastIndex >= start) {
                start = lastIndex + 1;
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}
