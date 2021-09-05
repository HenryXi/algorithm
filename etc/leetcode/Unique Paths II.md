# Unique Paths II
[Problem Description](https://leetcode.com/problems/unique-paths-ii/)

```
public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int n = obstacleGrid.length;
    int m = obstacleGrid[0].length;
    int[][] step = new int[n][m];
    for (int i = 0; i < n; i++) {
        if (obstacleGrid[i][0] == 1) {
            break;
        }
        step[i][0] = 1;
    }
    for (int i = 0; i < m; i++) {
        if (obstacleGrid[0][i] == 1) {
            break;
        }
        step[0][i] = 1;
    }
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
            step[i][j] = obstacleGrid[i][j] == 1 ? 0 : step[i - 1][j] + step[i][j - 1];
        }
    }
    return step[n - 1][m - 1];
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 38.6 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF