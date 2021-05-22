# Valid Parentheses
[Problem Description](https://leetcode.com/problems/valid-parentheses/)

```
public static boolean isValid(String s) {
    Map<Character, Character> map = new HashMap<>();
    map.put(']', '[');
    map.put(')', '(');
    map.put('}', '{');

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
        char currChar = s.charAt(i);
        if (map.keySet().contains(currChar)) {
            char topChar = stack.isEmpty() ? '#' : stack.pop();
            if (!map.get(currChar).equals(topChar)) {
                return false;
            }
        } else {
            stack.push(currChar);
        }
    }
    return stack.isEmpty();
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 2 ms | 36.8 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF