package com.henryxi.algorithm.string.zigzagconversion;


public class ZigZagConversionClient {
    public static void main(String[] args) {
        ZigZagConversionClient client = new ZigZagConversionClient();
        System.out.println(client.convert("PAYPALISHIRING", 4));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int length = s.length();
        int lengthCycle = 2 * numRows - 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < length; j = j + lengthCycle) {
                sb.append(s.charAt(i + j));
                if (i != 0 && i != numRows - 1 && j + lengthCycle - i < length) {
                    sb.append(s.charAt(j + lengthCycle - i));
                }
            }
        }
        return sb.toString();
    }
}
