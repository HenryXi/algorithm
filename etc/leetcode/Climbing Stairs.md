# Climbing Stairs
[Problem Description](https://leetcode.com/problems/climbing-stairs/)

```
public int climbStairs(int n) {
    if (n == 0) {
        return 0;
    }
    if(n==1){
        return 1;
    }
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 35.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF