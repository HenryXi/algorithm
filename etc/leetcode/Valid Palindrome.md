# Valid Palindrome
[Problem Description](https://leetcode.com/problems/valid-palindrome/)

```
public boolean isPalindrome(String s) {
    StringBuilder sb = new StringBuilder();
    for (Character c : s.toCharArray()) {
        if (Character.isLetterOrDigit(c)) {
            sb.append(Character.toLowerCase(c));
        }
    }

    int left = 0;
    int right = sb.length() - 1;
    while (left < right) {
        if (sb.charAt(left) != sb.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 3 ms | 39.3 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF