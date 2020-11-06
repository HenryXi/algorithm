# Unique Binary Search Trees
[Problem Description](https://leetcode.com/problems/unique-binary-search-trees/)

```
public int numTrees(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    int[] dp = new int[n + 1];
    dp[0] = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            dp[i] = dp[i] + dp[j - 1] * dp[(i - j)];
        }
    }
    return dp[n];
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 35.7 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF