package com.henryxi.algorithm.string.reverseleftwords;

public class ReverseLeftWordsClient {
    public static void main(String[] args) {
        ReverseLeftWordsClient client = new ReverseLeftWordsClient();
        System.out.println(client.reverseLeftWords("abcdefg", 2));
    }

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
