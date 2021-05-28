# Longest Common Prefix
[Problem Description](https://leetcode.com/problems/longest-common-prefix/)

```
public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
        return "";
    }
    if (strs.length == 1) {
        return strs[0];
    }
    String base = strs[0];
    for (String str : strs) {
        while (!str.startsWith(base)) {
            if (base.length() == 0) {
                return "";
            }
            base = base.substring(0, base.length() - 1);
        }
    }
    return base;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.8 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF