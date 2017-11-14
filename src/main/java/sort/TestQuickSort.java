package sort;

import java.util.Arrays;

public class TestQuickSort {
    static int[] num = {2, 42, 95, 4, 51, 67, 93, 63, 93, 43, 39, 92, 34, 51, 64, 83, 88, 0, 37, 85};

    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            num[i] = (int) (Math.random() * 100);
//        }
        sort(num, 0, 19);
        System.out.println(Arrays.toString(num));
    }

    //[2, 42, 95, 4, 51, 67, 93, 63, 93, 43, 39, 92, 34, 51, 64, 83, 88, 0, 37, 85]
    static void sort(int[] num, int start, int end) {
        int left, right, current, temp;
        if (start < end) {
            current = num[start];
            left = start;
            right = end + 1;
            while (true) {
                while (true) {
                    if (left >= end || num[++left] > current) {
                        break;
                    }
                }
                while (true) {
                    if (right <= start || num[--right] < current) {
                        break;
                    }
                }
                if (left >= right) {
                    break;
                }
                temp = num[left];
                num[left] = num[right];
                num[right] = temp;
            }
            num[start] = num[right];
            num[right] = current;
            System.out.println(Arrays.toString(num));
            sort(num, start, left - 1);
            sort(num, right + 1, end);
        }
    }
}

