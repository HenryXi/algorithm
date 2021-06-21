# Number of Islands
[Problem Description](https://leetcode.com/problems/number-of-islands/)

```
public int numIslands(char[][] A) {
    int length = A.length;
    int high = A[0].length;
    int res = 0;
    for (int i = 0; i < length; i++) {
        for (int j = 0; j < high; j++) {
            res += dfs(A, i, j);
        }
    }
    return res;
}

private int dfs(char[][] A, int i, int j) {
    int length = A.length;
    int high = A[0].length;
    if (i < 0 || i == length || j < 0 || j == high || A[i][j] == '0') {
        return 0;
    }
    A[i][j] = '0';
    dfs(A, i - 1, j);
    dfs(A, i + 1, j);
    dfs(A, i, j - 1);
    dfs(A, i, j + 1);
    return 1;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 2 ms | 40.9 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF