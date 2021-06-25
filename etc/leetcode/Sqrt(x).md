# Sqrt(x)
[Problem Description](https://leetcode.com/problems/sqrtx/)

```
public int mySqrt(int x) {
    int l = 0;
    int r = x;
    int res = -1;
    while (l <= r) {
        int mid = (l + r) / 2;
        long tempValue = (long) mid * mid;
        if (tempValue == x) {
            return mid;
        } else if (tempValue < x) {
            res = mid;
            l = mid + 1;
        } else {
            r = mid - 1;
        }
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 36.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF