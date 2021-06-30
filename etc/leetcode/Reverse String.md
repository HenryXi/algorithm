# Reverse String
[Problem Description](https://leetcode.com/problems/reverse-string/)

```
public void reverseString(char[] s) {
    int p1 = 0;
    int p2 = s.length - 1;
    while (p1 <= p2) {
        swap(s, p1, p2);
        p1++;
        p2--;
    }
}

private void swap(char[] s, int i, int j) {
    char temp = s[i];
    s[i] = s[j];
    s[j] = temp;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 44.7 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF