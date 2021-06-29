package com.henryxi.algorithm.number.integertoroman;

public class IntegerToRomanClient {
    public static void main(String[] args) {
        IntegerToRomanClient client = new IntegerToRomanClient();
        System.out.println(client.intToRoman(1994));
    }

    public String intToRoman(int num) {
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        String[] hundreds = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder sb = new StringBuilder();
        sb.append(thousands[num / 1000]);
        sb.append(hundreds[num % 1000 / 100]);
        sb.append(tens[num % 100 / 10]);
        sb.append(ones[num % 10]);
        return sb.toString();
    }
}
