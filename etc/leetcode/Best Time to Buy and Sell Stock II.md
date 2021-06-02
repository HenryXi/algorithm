# Best Time to Buy and Sell Stock II
[Problem Description](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)

```
public static int maxProfit(int[] prices) {
    int res = 0;
    for (int i = 1; i < prices.length; i++) {
        if (prices  [i - 1] < prices[i]) {
            res = prices[i] - prices[i - 1] + res;
        }
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 41 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF