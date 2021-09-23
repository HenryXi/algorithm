# Is Subsequence
[Problem Description](https://leetcode.com/problems/is-subsequence/)

```
public boolean isSubsequence(String s, String t) {
    int n = s.length();
    int m = t.length();
    int i = 0;
    int j = 0;
    while (i < n && j < m) {
        if (s.charAt(i) == t.charAt(j)) {
            i++;
        }
        j++;
    }
    return i == n;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 36.3 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF