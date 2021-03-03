# 3Sum
[Problem Description](https://leetcode.com/problems/3sum/)

```
public static List<List<Integer>> threeSum(int[] nums) {
    int len = nums.length;
    if (len < 3) {
        return new ArrayList<>();
    }
    if (len == 3 && nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
        return Collections.singletonList(Arrays.asList(0, 0, 0));
    }
    Arrays.sort(nums);
    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 0; i < len; i++) {
        if (nums[i] > 0) {
            break;
        }
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue; // 去重
        }
        int L = i + 1;
        int R = len - 1;
        while (L < R) {
            int sum = nums[i] + nums[L] + nums[R];
            if (sum == 0) {
                ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
                while (L < R && nums[L] == nums[L + 1]) L++; // 去重
                while (L < R && nums[R] == nums[R - 1]) R--; // 去重
                L++;
                R--;
            } else if (sum < 0) {
                L++;
            } else {
                R--;
            }
        }
    }
    return ans;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
|  19 ms | 42.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF