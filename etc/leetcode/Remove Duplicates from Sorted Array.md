# Remove Duplicates from Sorted Array
[Problem Description](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

```
public static int removeDuplicates(int[] nums) {
    int j = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {
            j++;
        } else {
            nums[i - j] = nums[i];
        }
    }
    return nums.length - j;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 40.6 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF