# Reverse Integer
[Problem Description](https://leetcode.com/problems/reverse-integer/)

```
public static int reverse(int x) {
    long n = 0;
    while (x != 0) {
        n = n * 10 + x % 10;
        x = x / 10;
    }
    return (int) n == n ? (int) n : 0;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 36.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF