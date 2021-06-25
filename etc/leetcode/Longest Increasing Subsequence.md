# Longest Increasing Subsequence
[Problem Description](https://leetcode.com/problems/longest-increasing-subsequence/)

```
public int lengthOfLIS(int[] nums) {
    int[] res = new int[nums.length];
    int len = 0;
    for (int num : nums) {
        int index = Arrays.binarySearch(res, 0, len, num);
        index = index < 0 ? -index - 1 : index;
        res[index] = num;
        if (index == len) {
            len++;
        }
    }
    return len;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 3 ms | 38.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF