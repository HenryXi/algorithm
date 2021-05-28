# Maximum Subarray
[Problem Description](https://leetcode.com/problems/maximum-subarray/)

```
public static int maxSubArray(int[] nums) {
    int res = nums[0];
    int sum = 0;
    for (int i : nums) {
        if (sum > 0) {
            sum = sum + i;
        } else {
            sum = i;
        }
        res = Math.max(res, sum);
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 38.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF