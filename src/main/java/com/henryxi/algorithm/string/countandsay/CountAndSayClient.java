package com.henryxi.algorithm.string.countandsay;
//todo not finish
public class CountAndSayClient {
    public static void main(String[] args) {
        CountAndSayClient client = new CountAndSayClient();
        System.out.println(client.countAndSay(3));
    }

    public String countAndSay(int n) {
        String s = "1";
        StringBuilder res = new StringBuilder();
        if (n == 1) {
            return s;
        }
        for (int k = 0; k < n - 1; k++) {
            for (int i = 0, j = 0; i < s.length(); ) {
                while (s.charAt(i) == s.charAt(j)) {
                    ++j;
                }
                res.append(j - i + '0');
                res.append(s.charAt(i));
                i = j;
            }
            s = res.toString();
            res = new StringBuilder();
        }
        return s;
    }
}
