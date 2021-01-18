# Best Time to Buy and Sell Stock
[Problem Description](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

```
public static int maxProfit(int[] prices) {
    if (prices.length <= 1) {
        return 0;
    }
    int minPrice = prices[0];
    int maxProfit = 0;
    for (int i = 1; i < prices.length; i++) {
        minPrice = Math.min(minPrice, prices[i]);
        maxProfit = Math.max(maxProfit, prices[i] - minPrice);
    }
    return maxProfit;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 2 ms | 51.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF