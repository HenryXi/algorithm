package com.henryxi.algorithm.sort;

public class QuickSort4 extends AbstractSort {

    public static void main(String[] args) {
        QuickSort4 quickSort4 = new QuickSort4();
        quickSort4.printInfo();
    }

    @Override
    void sort() {
        start = System.nanoTime();
        quicksort_4(number, 0, MAX - 1);
        end = System.nanoTime();
    }

    private void quicksort_4(int number[], int left, int right) {
        int privetKey;
        if (left < right) {
            privetKey = portion(number, left, right);
            quicksort_4(number, left, privetKey - 1);
            quicksort_4(number, privetKey + 1, right);
        }
    }

    private int portion(int number[], int left, int right) {
        int key = number[left];
        while (left < right) {
            while (left < right && number[right] >= key) {
                right--;
            }
            swap(number, left, right);
            while (left < right && number[left] <= key) {
                left++;
            }
            swap(number, left, right);
        }
        return left;
    }

    private void swap(int[] number, int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }
}
