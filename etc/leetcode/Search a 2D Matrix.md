# Search a 2D Matrix
[Problem Description](https://leetcode.com/problems/search-a-2d-matrix/)

```
public boolean searchMatrix(int[][] matrix, int target) {
    int left = 0;
    int right = matrix.length * matrix[0].length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        int value = matrix[mid / matrix[0].length][mid % matrix[0].length];
        if (value == target) {
            return true;
        }
        if (value > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return false;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 37.6 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF