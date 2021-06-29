package com.henryxi.algorithm.string.addbinary;

public class AddBinaryClient {
    public static void main(String[] args) {
        AddBinaryClient client = new AddBinaryClient();
        System.out.println(client.addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                c = a.charAt(i--) == '1' ? c + 1 : c;
            }
            if (j >= 0) {
                c = b.charAt(j--) == '1' ? c + 1 : c;
            }
            sb.append(c % 2);
            c = c / 2;
        }
        return c == 1 ? '1' + sb.reverse().toString() : sb.reverse().toString();
    }
}
