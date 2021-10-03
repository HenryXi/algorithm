# Fraction to Recurring Decimal
[Problem Description](https://leetcode.com/problems/fraction-to-recurring-decimal/)

```
public String fractionToDecimal(int numerator, int denominator) {
    StringBuilder sb = new StringBuilder();
    long a = numerator;
    long b = denominator;
    if (a * b < 0) {
        sb.append("-");
    }
    a = Math.abs(a);
    b = Math.abs(b);
    sb.append(a / b);
    if (a % b == 0) {
        return sb.toString();
    }
    sb.append(".");
    Map<Long, Integer> map = new HashMap<>();
    while (true) {
        a = (a % b) * 10;
        if (a == 0) {
            return sb.toString();
        }
        if (map.containsKey(a)) {
            break;
        }
        map.put(a, sb.length());
        sb.append(a / b);
    }
    return sb.insert(map.get(a), "(").append(")").toString();
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 2 ms | 38.3 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF