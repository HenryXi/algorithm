package com.henryxi.algorithm.sort;

public class MergeSort extends AbstractSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.printInfo();
    }

    @Override
    void sort() {
        int number2[] = new int[MAX];
        System.out.print("number2 for merge sort：");
        for (int i = 0; i < 20; i++) {
            number2[i] = (int) (Math.random() * 100);
            System.out.print(number2[i] + " ");
        }
        System.out.println();
        int number3[] = new int[MAX + MAX];
        start = System.nanoTime();
        quicksort_3(numbersArray, 0, MAX - 1);
        quicksort_3(number2, 0, MAX - 1);
        merge(numbersArray, MAX, number2, MAX, number3);
        end = System.nanoTime();
        numbersArray = number3;
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

    private void quicksort_3(int number[], int left, int right) {
        int q;
        if (left < right) {
            q = partition(number, left, right);
            quicksort_3(number, left, q - 1);
            quicksort_3(number, q + 1, right);
        }
    }

    private void merge(int number1[], int M, int number2[], int N, int number3[]) {
        int i = 0, j = 0, k = 0;
        while (i < M && j < N) {
            if (number1[i] <= number2[j]) {
                number3[k++] = number1[i++];
            } else {
                number3[k++] = number2[j++];
            }
        }
        while (i < M) {
            number3[k++] = number1[i++];
        }
        while (j < N) {
            number3[k++] = number2[j++];
        }
    }
}
