# Merge Sorted Array
[Problem Description](https://leetcode.com/problems/merge-sorted-array/)

```
public void merge(int[] nums1, int m, int[] nums2, int n) {
    int index1 = m - 1;
    int index2 = n - 1;
    int indexNew = m + n - 1;
    int lastItem = -1;
    do {
        if (indexNew < 0) {
            break;
        }
        if (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                lastItem = nums1[index1];
                index1--;
            } else {
                lastItem = nums2[index2];
                index2--;
            }
        } else {
            if (index1 < 0) {
                lastItem = nums2[index2];
                index2--;
            } else {
                lastItem = nums1[index1];
                index1--;
            }
        }
        nums1[indexNew--] = lastItem;
    } while (true);
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
|  0 ms | 39.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF