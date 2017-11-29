# Java binary search example
"Binary Search" is used for finding the target number in an ordered array. There are two ways to find the index 
of target number, recursion and looping. The example code is here.

**Recursion**

Compare the target number and de middle number and to find the right range, then pass the start and end index 
`binSearch` method until the middle number equals the target number. 
```java
public class BinarySearchRecursion {
    public static void main(String[] args) {
        // index :        0, 1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14
        int srcArray[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};
        int targetIndex = new Random().nextInt(srcArray.length);
        int target = srcArray[targetIndex];
        int index = binSearch(srcArray, 0, srcArray.length - 1, target);
        System.out.println("to be found num:" + target + ",index is:" + index);
    }

    private static int binSearch(int srcArray[], int start, int end, int key) {
        int mid = (end - start) / 2 + start;
        if (srcArray[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, start, mid - 1, key);
        }
        return -1;
    }
}
```

**Loop**

Get the middle number and compare it to the target number. If the middle number bigger then the target number
then use [middle+1,end] of array to do next loop. Otherwise, use the [start,middle-1] of array to do next loop. The 
condition of stopping loop is start less than or equals to end.
```java
public class BinarySearchLoop {
    public static void main(String[] args) {
        // index :        0, 1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14
        int srcArray[] = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};
        int targetIndex = new Random().nextInt(srcArray.length);
        int target = srcArray[targetIndex];
        int index = binSearch(srcArray, target);
        System.out.println("to be found num:" + target + ",index is:" + index);
    }

    private static int binSearch(int[] srcArray, int target) {
        int mid = srcArray.length / 2;
        if (target == srcArray[mid]) {
            return mid;
        }
        int start = 0;
        int end = srcArray.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (target < srcArray[mid]) {
                end = mid - 1;
            } else if (target > srcArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
```

EOF