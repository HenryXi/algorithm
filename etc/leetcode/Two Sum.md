# Two Sum
[Problem Description](https://leetcode.com/problems/two-sum/)

```
public int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
    for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length; j++) {
            if(nums[i]+nums[j]==target){
                res[0]=i;
                res[1]=j;
                return res;
            }
        }
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF