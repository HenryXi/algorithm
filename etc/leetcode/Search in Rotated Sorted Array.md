# Search in Rotated Sorted Array
[Problem Description](https://leetcode.com/problems/search-in-rotated-sorted-array/)

```
public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
        int midIndex = (left + right) / 2;
        if (nums[midIndex] == target) {
            return midIndex;
        }
        if (nums[midIndex] < nums[right]) {
            if (nums[midIndex] < target && nums[right] >= target) {
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        } else {
            if (nums[left] <= target && nums[midIndex] > target) {
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }
    }
    return -1;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 38.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF