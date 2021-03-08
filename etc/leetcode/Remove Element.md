# Remove Element
[Problem Description](https://leetcode.com/problems/remove-element/)

```
public static int removeElement(int[] nums, int val) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == val) {
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
| 0 ms | 37.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF