# License Key Formatting
[Problem Description](https://leetcode.com/problems/license-key-formatting/)

```
public String licenseKeyFormatting(String s, int k) {
    s = s.replaceAll("-", "");
    int first = s.length() % k;
    int group = s.length() / k;
    StringBuilder sb = new StringBuilder(s.toUpperCase());
    int addIndex=0;
    for (int i = 0; i < group; i++) {
        int offset = first + k * i+addIndex;
        if (offset > 0) {
            sb.insert(offset, '-');
            addIndex++;
        }
    }
    return sb.toString();
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 29 ms | 39.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF