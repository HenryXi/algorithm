# Minimum Path Sum
[Problem Description](https://leetcode.com/problems/minimum-path-sum/)

```
public int minPathSum(int[][] grid) {
    int length = grid.length;
    int high = grid[0].length;
    if(length ==0 || high == 0 ){
        return 0;
    }
    for(int i=1;i<length;i++){
        grid[i][0]=grid[i][0]+grid[i-1][0];
    }
    for(int i = 1;i<high;i++){
        grid[0][i] = grid[0][i]+grid[0][i-1];
    }
    for(int i = 1;i<length; i++){
        for(int j = 1;j<high;j++){
            grid[i][j]=grid[i][j]+Math.min(grid[i-1][j],grid[i][j-1]);
        }
    }
    return grid[length-1][high-1];
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
|  1 ms |  41.6 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF