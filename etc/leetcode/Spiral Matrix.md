# Spiral Matrix
[Problem Description](https://leetcode.com/problems/spiral-matrix/)

```
public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> res = new LinkedList<>();
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return res;
    }
    int left = 0;
    int right = matrix[0].length - 1;
    int top = 0;
    int bottom = matrix.length - 1;
    while (left <= right && top <= bottom) {
        for (int i = left; i <= right; i++) {
            res.add(matrix[top][i]);
        }
        for (int i = top + 1; i <= bottom; i++) {
            res.add(matrix[i][right]);
        }
        if (left < right && top < bottom) {
            for (int i = right - 1; i > left; i--) {
                res.add(matrix[bottom][i]);
            }
            for (int i = bottom; i > top; i--) {
                res.add(matrix[i][left]);
            }
        }
        left++;
        right--;
        top++;
        bottom--;
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 37.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF