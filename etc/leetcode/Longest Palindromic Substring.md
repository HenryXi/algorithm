# Longest Palindromic Substring
[Problem Description](https://leetcode.com/problems/longest-palindromic-substring/)

```
public static String longestPalindrome(String s) {
    if (s == null || s.length() == 0) {
        return "";
    }
    int maxLength = 0;
    int startIndex = 0;
    for (int i = 0; i < s.length(); i++) {
        int len = 1;
        int left = i - 1;
        int right = i + 1;
        while (left >= 0 && s.charAt(left) == s.charAt(i)) {
            left--;
            len++;
        }
        while (right < s.length() && s.charAt(right) == s.charAt(i)) {
            right++;
            len++;
        }
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            len = len + 2;
        }
        if (len > maxLength) {
            maxLength = len;
            startIndex = left + 1;
        }
    }
    return s.substring(startIndex, startIndex + maxLength );
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 42 ms | 38.8 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF