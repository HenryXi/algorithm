package com.henryxi.algorithm.string.zigzagconversion;

//todo not finish
public class ZigZagConversionClient {
    public static void main(String[] args) {
        ZigZagConversionClient client = new ZigZagConversionClient();
        client.convert("PAYPALISHIRING", 4);
    }

    public String convert(String s, int numRows) {
        int length = s.length();
        int arraysNum = length / (2 * numRows - 2) + 1;
        int[][] temp = new int[arraysNum][numRows];
        for (int i = 0; i < arraysNum; i++) {
            for (int j = 0; j < numRows; j++) {
                int modeRows = i % (numRows-1);
                if(modeRows==0){
                    temp[i][j] = i*numRows+
                }else{

                }
                temp[i][j] = -1;
            }
        }

        for (int i = 0; i < length; i++) {
            int modCycle = i % (2 * numRows - 2);
            int modRows = i % numRows;
            s.charAt()
        }
    }
}
