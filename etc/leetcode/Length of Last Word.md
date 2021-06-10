# Length of Last Word
[Problem Description](https://leetcode.com/problems/length-of-last-word/)

```
public int lengthOfLastWord(String s) {
    s = s.trim();
    int length = s.length();
    for (int i = length - 1; i >= 0; i--) {
        if (s.charAt(i) == ' ') {
            return length - 1 - i;
        } else if (i == 0) {
            return length;
        }
    }
    return 0;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF