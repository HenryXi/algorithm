# Roman to Integer
[Problem Description](https://leetcode.com/problems/roman-to-integer/)

```
public static int romanToInt(String s) {
    char[] chars = s.toCharArray();
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
        if (i == s.length() - 1 || (i + 1 < s.length() && getInt(chars[i]) >= getInt(chars[i + 1]))) {
            result = result + getInt(chars[i]);
        } else {
            result = result - getInt(chars[i]);
        }
    }
    return result;
}

private static int getInt(Character romanNum) {
    switch (romanNum) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
    }
    return 0;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 4 ms | 39 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF