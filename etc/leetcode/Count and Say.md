# Count and Say
[Problem Description](https://leetcode.com/problems/count-and-say/)

```
public String countAndSay(int n) {
    String res = "1";
    for (int i = 1; i < n; i++) {
        StringBuilder tempStr = new StringBuilder();
        for (int j = 0; j < res.length(); j++) {
            int count = 1;
            while (j < res.length() - 1 && res.charAt(j) == res.charAt(j + 1)) {
                j++;
                count++;
            }
            tempStr.append(count).append(res.charAt(j));
        }
        res = tempStr.toString();
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 5 ms | 36.6 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF