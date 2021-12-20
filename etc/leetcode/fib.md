# fib
[fib](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/)

```
public int fib(int n) {
    int mod = 1000000007;
    if (n < 2) {
        return n;
    }
    int first = 0;
    int second = 0;
    int result = 1;
    for (int i = 2; i <= n; i++) {
        first = second;
        second = result;
        result = (first + second) % mod;
    }
    return result;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 35.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF