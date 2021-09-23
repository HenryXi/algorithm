package com.henryxi.algorithm.string.issubsequence;

public class IsSubsequenceClient {
    public static void main(String[] args) {
        IsSubsequenceClient client = new IsSubsequenceClient();
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(client.isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}
