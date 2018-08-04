package com.henryxi.algorithm.sort;

public class HeapSort extends AbstractSort {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        heapSort.printInfo();
    }

    @Override
    void sort() {
        int m, p, s, temp;
        start = System.nanoTime();
        int number_temp[] = new int[NUMBERS_COUNT + 1];
        for (int temp_i = 1; temp_i < NUMBERS_COUNT + 1; temp_i++) {
            number_temp[temp_i] = numbersArray[temp_i - 1];
        }
        createheap(number_temp);
        m = NUMBERS_COUNT;
        while (m > 1) {
            temp = number_temp[1];
            number_temp[1] = number_temp[m];
            number_temp[m] = temp;
            m--;
            p = 1;
            s = 2 * p;
            while (s <= m) {
                if (s < m && number_temp[s + 1] > number_temp[s])
                    s++;
                if (number_temp[p] >= number_temp[s])
                    break;
                temp = number_temp[p];
                number_temp[p] = number_temp[s];
                number_temp[s] = temp;
                p = s;
                s = 2 * p;
            }
        }
        for (int temp_j = 1; temp_j < NUMBERS_COUNT + 1; temp_j++) {
            numbersArray[temp_j - 1] = number_temp[temp_j];
        }
        end = System.nanoTime();
    }

    public void createheap(int number[]) {
        int i, s, p, temp;
        int heap[] = new int[NUMBERS_COUNT + 1];
        for (i = 1; i <= NUMBERS_COUNT; i++) {
            heap[i] = number[i];
            s = i;
            p = i / 2;
            while (s >= 2 && heap[p] < heap[s]) {
                temp = heap[p];
                heap[p] = heap[s];
                heap[s] = temp;
                s = p;
                p = s / 2;
            }
        }
        for (i = 1; i <= NUMBERS_COUNT; i++) {
            number[i] = heap[i];
        }
    }
}
