# Letter Combinations of a Phone Number
[Problem Description](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

```
public static List<String> letterCombinations(String digits) {
    Map<Character, List<String>> map = new HashMap<>();
    map.put('2', Arrays.asList("a", "b", "c"));
    map.put('3', Arrays.asList("d", "e", "f"));
    map.put('4', Arrays.asList("g", "h", "i"));
    map.put('5', Arrays.asList("j", "k", "l"));
    map.put('6', Arrays.asList("m", "n", "o"));
    map.put('7', Arrays.asList("p", "q", "r", "s"));
    map.put('8', Arrays.asList("t", "u", "v"));
    map.put('9', Arrays.asList("w", "x", "y", "z"));
    List<String> res = new LinkedList<>();
    for (Character c : digits.toCharArray()) {
        List<String> curStr = map.get(c);
        if (res.size() == 0) {
            res.addAll(curStr);
        }else{
            List<String> newRes = new LinkedList<>();
            for(String existCharacter:res){
                for(String cur:curStr){
                    newRes.add(existCharacter+cur);
                    res = newRes;
                }
            }
        }
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 37.7 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF