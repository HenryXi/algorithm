# Plus One
[Problem Description](https://leetcode.com/problems/plus-one/)

```
public static int[] plusOne(int[] digits) {
    int lastIndex = digits.length - 1;
    int adder = 1;
    for (int i = lastIndex; i >= 0; i--) {
        digits[i] = digits[i] + adder;
        if (digits[i] == 10) {
            digits[i]=0;
            adder=1;
        }else{
            adder=0;
        }
    }
    if(adder==1){
        int[] res = new int[lastIndex+2];
        res[0]=1;
        return res;
    }
    return digits;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 36.9 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF