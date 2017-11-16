package com.henryxi.algorithm.sort;

public class QuickSort3 extends AbstractSort {
    public static void main(String[] args) {
        QuickSort3 quickSort3 = new QuickSort3();
        quickSort3.printInfo();
    }

    @Override
    void sort() {
        start = System.nanoTime();
        quicksort_3(number, 0, MAX - 1);
        end = System.nanoTime();
    }

    private void quicksort_3(int number[], int left, int right) {
        int q;
        if (left < right) {
            q = partition(number, left, right);
            quicksort_3(number, left, q - 1);
            quicksort_3(number, q + 1, right);
        }
    }

    private int partition(int number[], int left, int right) {
        int i, j, s, temp;
        s = number[right];
        i = left - 1;
        for (j = left; j < right; j++) {
            if (number[j] <= s) {
                i++;
                temp = number[i];
                number[i] = number[j];
                number[j] = temp;
            }
        }
        temp = number[i + 1];
        number[i + 1] = number[right];
        number[right] = temp;
        return i + 1;
    }

}
