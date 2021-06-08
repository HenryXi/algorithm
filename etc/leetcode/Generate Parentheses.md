# Generate Parentheses
[Problem Description](https://leetcode.com/problems/generate-parentheses/)

```
private List<String> res = new ArrayList<>();

public List<String> generateParenthesis(int n) {
    dfs("", n, 0, 0);
    return res;
}

private void dfs(String ans, int n, int leftCount, int rightCount) {
    if (rightCount > leftCount || leftCount > n) {
        return;
    }
    if (leftCount == rightCount && rightCount == n) {
        res.add(ans);
    }
    dfs(ans + "(", n, leftCount + 1, rightCount);
    dfs(ans + ")", n, leftCount, rightCount + 1);
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 38.9 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF