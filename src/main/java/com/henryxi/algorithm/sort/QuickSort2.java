package com.henryxi.algorithm.sort;

public class QuickSort2 extends AbstractSort {
    public static void main(String[] args) {
        QuickSort2 quickSort2 = new QuickSort2();
        quickSort2.printInfo();
    }

    @Override
    void sort() {
        start = System.nanoTime();
        quicksort_2(numbersArray, 0, NUMBERS_COUNT - 1);
        end = System.nanoTime();
    }

    private void quicksort_2(int number[], int left, int right) {
        int i, j, s, temp;
        if (left < right) {
            s = number[(left + right) / 2];
            i = left - 1;
            j = right + 1;
            while (true) {
                while (number[++i] < s) ;
                while (number[--j] > s) ;
                if (i >= j)
                    break;
                temp = number[i];
                number[i] = number[j];
                number[j] = temp;
            }
            quicksort_2(number, left, i - 1);
            quicksort_2(number, j + 1, right);
        }
    }
}
