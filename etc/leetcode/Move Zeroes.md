# Move Zeroes
[Problem Description](https://leetcode.com/problems/move-zeroes/)

```
public static void moveZeroes(int[] nums) {
    int newIndex = 0;
    for (int i = 0; i <= nums.length - 1; i++) {
        if (nums[i] != 0) {
            nums[newIndex++] = nums[i];
        }
    }
    while (newIndex < nums.length) {
        nums[newIndex] = 0;
        newIndex++;
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 38.9 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF