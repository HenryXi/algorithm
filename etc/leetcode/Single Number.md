# Single Number
[Problem Description](https://leetcode.com/problems/single-number/)

```
public int singleNumber(int[] nums) {
    int a = 0;
    for (int n : nums) {
        a = a ^ n;
    }
    return a;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 38.6 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF