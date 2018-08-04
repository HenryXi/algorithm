package com.henryxi.algorithm.sort;

public class ShakeSort extends AbstractSort {
    public static void main(String[] args) {
        ShakeSort shakeSort = new ShakeSort();
        shakeSort.printInfo();
    }
    @Override
    void sort() {
        int i, temp, left = 0, right = NUMBERS_COUNT - 1, shift = 0;
        start = System.nanoTime();
        while (left < right) {
            // 向右進行氣泡排序
            for (i = left; i < right; i++) {
                if (numbersArray[i] > numbersArray[i + 1]) {
                    temp = numbersArray[i];
                    numbersArray[i] = numbersArray[i + 1];
                    numbersArray[i + 1] = temp;
                    shift = i;
                }
            }
            right = shift;
            for (i = right; i > left; i--) {
                if (numbersArray[i] < numbersArray[i - 1]) {
                    temp = numbersArray[i];
                    numbersArray[i] = numbersArray[i - 1];
                    numbersArray[i - 1] = temp;
                    shift = i;
                }
            }
            left = shift;
        }
        end = System.nanoTime();
    }
}
