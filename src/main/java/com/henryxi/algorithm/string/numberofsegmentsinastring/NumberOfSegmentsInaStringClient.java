package com.henryxi.algorithm.string.numberofsegmentsinastring;

public class NumberOfSegmentsInaStringClient {
    public static void main(String[] args) {
        NumberOfSegmentsInaStringClient client = new NumberOfSegmentsInaStringClient();
        System.out.println(client.countSegments("Hello, my name is John"));
    }

    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
