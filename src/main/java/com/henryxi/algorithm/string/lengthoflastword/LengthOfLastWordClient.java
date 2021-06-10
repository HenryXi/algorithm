package com.henryxi.algorithm.string.lengthoflastword;

public class LengthOfLastWordClient {
    public static void main(String[] args) {
        LengthOfLastWordClient client = new LengthOfLastWordClient();
        System.out.println(client.lengthOfLastWord(" a"));
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return length - 1 - i;
            } else if (i == 0) {
                return length;
            }
        }
        return 0;
    }
}
