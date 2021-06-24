# Find Repeat Number
[Problem Description](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)

```
public static int findRepeatNumber(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        while(nums[i]!=i){
            if (nums[nums[i]] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            } else {
                return nums[i];
            }
        }
    }
    return -1;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 46 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF