# Number of Segments in a String
[Problem Description](https://leetcode.com/problems/number-of-segments-in-a-string)

```
public int countSegments(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
            count++;
        }
    }
    return count;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 37 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF