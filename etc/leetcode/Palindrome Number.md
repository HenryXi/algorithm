# Palindrome Number
[Problem Description](https://leetcode.com/problems/palindrome-number/)

```
public static boolean isPalindrome(int x) {
    if (x < 0) {
        return false;
    }
    int origin = x;
    long n = 0;
    while (x != 0) {
        n = n * 10 + x % 10;
        x = x / 10;
    }
    return (int) n == origin;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 6 ms | 38 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF