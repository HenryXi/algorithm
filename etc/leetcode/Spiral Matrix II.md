# Spiral Matrix II
[Problem Description](https://leetcode.com/problems/spiral-matrix-ii/)

```
public int[][] generateMatrix(int n) {
    int maxNum = n * n;
    int curNum = 1;
    int[][] matrix = new int[n][n];
    int row = 0;
    int column = 0;
    //left to right:row not change ,column++ , {0,1}
    //up to bottom:row++,column not change, {1,0}
    //right to left:row not change,column==,{0,-1}
    //bottom to up:row--,column not change,{-1,0}
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int directionIndex = 0;
    while (curNum <= maxNum) {
        matrix[row][column] = curNum;
        curNum++;
        int nextRow = row + directions[directionIndex][0];
        int nextColumn = column + directions[directionIndex][1];
        if (isChangeDirection(n, nextRow, nextColumn, matrix)) {
            directionIndex = (directionIndex + 1) % 4; // 顺时针旋转至下一个方向
        }
        row = row + directions[directionIndex][0];
        column = column + directions[directionIndex][1];
    }
    return matrix;
}

private static boolean isChangeDirection(int n, int nextRow, int nextColumn, int[][] matrix) {
    return nextRow < 0 || nextRow >= n || nextColumn < 0 || nextColumn >= n || matrix[nextRow][nextColumn] != 0;
}

```

| Runtime | Memory     | 
|:--------| :---------- |
| 0 ms    | 41.96 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF