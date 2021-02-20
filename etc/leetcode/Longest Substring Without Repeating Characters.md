# Longest Substring Without Repeating Characters
[Problem Description](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

```
public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int res = 0;
    int start = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        Integer lastIndex = map.get(c);
        map.put(c, i);
        if (lastIndex != null && lastIndex >= start) {
            start = lastIndex + 1;
        }
        res = Math.max(res, i - start + 1);
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 5 ms | 38.8 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF