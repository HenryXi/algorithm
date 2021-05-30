# Implement strStr()
[Problem Description](https://leetcode.com/problems/implement-strstr/)

```
public static int strStr(String haystack, String needle) {
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
        if (isSameAfter(haystack, needle, i)) {
            return i;
        }
    }
    return -1;
}

private static boolean isSameAfter(String haystack, String needle, int begin) {
    for (int i = 0; i < needle.length(); i++) {
        if (haystack.charAt(begin + i) != needle.charAt(i)) {
            return false;
        }
    }
    return true;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 37.7 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF