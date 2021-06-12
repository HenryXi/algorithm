# Jump Game
[Problem Description](https://leetcode.com/problems/jump-game/)

```
public boolean canJump(int[] nums) {
    int length = nums.length;
    if (length == 1) {
        return true;
    }
    int cur = nums[0];
    int i;
    for (i = 1; i < length && cur > 0; i++) {
        cur--;
        if (nums[i] > cur) {
            cur = nums[i];
        }
    }
    return i == length;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 2 ms | 40 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF