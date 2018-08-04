package com.henryxi.algorithm.sort;

public class QuickSort1 extends AbstractSort {
    public static void main(String[] args) {
        QuickSort1 quickSort1 = new QuickSort1();
        quickSort1.printInfo();
    }

    @Override
    void sort() {
        start = System.nanoTime();
        quicksort_1(numbersArray, 0, MAX - 1);
        end = System.nanoTime();
    }

    private void quicksort_1(int number[], int left, int right) {
        int i, j, s, temp;
        if (left < right) {
            s = number[left];
            i = left;
            j = right + 1;
            while (true) {
                // 向右找
                while (i + 1 < number.length && number[++i] < s) ;
                // 向左找
                while (j - 1 > -1 && number[--j] > s) ;
                if (i >= j)
                    break;
                temp = number[i];
                number[i] = number[j];
                number[j] = temp;
            }
            number[left] = number[j];
            number[j] = s;
            quicksort_1(number, left, j - 1); // 对左边进行递回
            quicksort_1(number, j + 1, right); // 对右边进行递回
        }
    }
}
