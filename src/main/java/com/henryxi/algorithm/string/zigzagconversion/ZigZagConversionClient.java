package com.henryxi.algorithm.string.zigzagconversion;

//todo not finish
public class ZigZagConversionClient {
    public static void main(String[] args) {
        ZigZagConversionClient client = new ZigZagConversionClient();
        client.convert("PAYPALISHIRING", 4);
    }

    public String convert(String s, int numRows) {
        if (numRows == 0) {
            return s;
        }
        int length = s.length();
        int arraysNum = length / (2 * numRows - 2) + 1;
        int[][] temp = new int[arraysNum][numRows];
        for (int i = 0; i < arraysNum; i++) {
            for (int j = 0; j < numRows; j++) {
                temp[i][j] = -1;
            }
        }
        int loopLength = 2 * numRows - 2;
        for (int i = 0; i < length; i++) {
            int arrayIndex = getArrayIndex(i, loopLength, numRows);
            int index = getIndex(i);
            temp[arrayIndex][index] = s.charAt(i);
        }
    }

    private int getIndex(int i) {
        return 0;
    }

    private int getArrayIndex(int i, int loopLength, int numRows) {
        int indexOfLoop = (i + 1) / loopLength;
        int beforeArrayNum = indexOfLoop * (numRows - 1);
        int indexInLoop = (i + 1) % loopLength;
        if (indexInLoop <= numRows) {
            return 1 + beforeArrayNum;
        } else {
            return indexInLoop - numRows + beforeArrayNum;
        }
    }
}
