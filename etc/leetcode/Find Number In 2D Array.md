# Find Number In 2D Array
[Problem Description](https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/)

```
public boolean findNumberIn2DArray(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return false;
    }
    int row = 0;
    int column = matrix[0].length - 1;
    while (row < matrix.length && column >= 0) {
        if (matrix[row][column] == target) {
            return true;
        } else if (matrix[row][column] > target) {
            column--;
        } else {
            row++;
        }
    }
    return false;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 44.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF