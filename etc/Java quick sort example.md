# Java quick sort example
`Quicksort` is one of the most common sorting algorithms. The logic of `Quicksort` is choosing a number (called pivot) 
and divide the rest into two parts. After first sorting the numbers on the left side are all less than pivot and 
the numbers on the right side are all bigger than pivot. Then do the same thing for left and right part.

**Code**
```java
public class TestQuickSort {
    static int[] num = new int[20];
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            num[i] = (int) (Math.random() * 100);
        }
        sort(num, 0, 19);
        System.out.println(Arrays.toString(num));
    }

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
```
**output**
```
[76, 51, 94, 12, 30, 19, 54, 56, 13, 3, 17, 90, 44, 73, 14, 52, 95, 76, 18, 95]
[14, 51, 18, 12, 30, 19, 54, 56, 13, 3, 17, 52, 44, 73, 76, 90, 95, 76, 94, 95]
[12, 3, 13, 14, 30, 19, 54, 56, 18, 51, 17, 52, 44, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 30, 19, 54, 56, 18, 51, 17, 52, 44, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 30, 19, 54, 56, 18, 51, 17, 52, 44, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 30, 19, 54, 56, 18, 51, 17, 52, 44, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 18, 19, 17, 30, 56, 51, 54, 52, 44, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 56, 51, 54, 52, 44, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 56, 51, 54, 52, 44, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 56, 51, 54, 52, 44, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 44, 51, 54, 52, 56, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 44, 51, 54, 52, 56, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 44, 51, 54, 52, 56, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 44, 51, 52, 54, 56, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 44, 51, 52, 54, 56, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 44, 51, 52, 54, 56, 73, 76, 90, 95, 76, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 44, 51, 52, 54, 56, 73, 76, 76, 90, 95, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 44, 51, 52, 54, 56, 73, 76, 76, 90, 95, 94, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 44, 51, 52, 54, 56, 73, 76, 76, 90, 94, 95, 95]
[3, 12, 13, 14, 17, 18, 19, 30, 44, 51, 52, 54, 56, 73, 76, 76, 90, 94, 95, 95]
```

**analyze**

* pick the first element as pivot;
* define two points left and right;
* move the left pointer from the begin of arrays to the end, and find the number which bigger then pivot;
* move the right pointer from the end of arrays to the start, and find the number which less than pivot;
* swap the number of left pointer and the number of right pointer;
* if left and right pointer are meet swap the pivot to the number which before left pointer;
* do the same thing for left and right part;

EOF