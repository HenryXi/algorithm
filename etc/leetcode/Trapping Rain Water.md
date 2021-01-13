# Trapping Rain Water
[Problem Description](https://leetcode.com/problems/trapping-rain-water/)

There way two ways to solve this problem.

**effective**
```
public static int trap(int[] height) {
    int h1 = 0;
    int h2 = 0;
    int sum = 0;
    for (int i = 0; i < height.length; i++) {
        h1 = Math.max(h1, height[i]);
        h2 = Math.max(h2, height[height.length - i - 1]);
        sum = sum + h1 + h2 - height[i];
    }
    sum = sum - h1 * height.length;
    return sum;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 38.6 MB	   |

**ineffective**
```
public static int trapIneffective(int[] height) {
    int sum = 0;
    for (int i = 0; i < height.length; i++) {
        int currentSum = getCurrentSum(height, i);
        System.out.println("index:" + i + ",value:" + currentSum);
        sum = sum + currentSum;
    }
    return sum;
}

private static int getCurrentSum(int[] array, int i) {
    int leftHeight = getLeftMax(array, i);
    if (leftHeight <= 0) {
        return 0;
    }
    int rightHeight = getRightMax(array, i);
    if (rightHeight <= 0) {
        return 0;
    }
    int min = Math.min(leftHeight, rightHeight);
    return min - array[i];
}

private static int getLeftMax(int[] array, int i) {
    return findMaxHeight(array, 0, i - 1, array[i]);
}

private static int getRightMax(int[] array, int i) {
    return findMaxHeight(array, i + 1, array.length - 1, array[i]);
}


private static int findMaxHeight(int[] array, int begin, int end, int currentValue) {
    int max = 0;
    for (int i = begin; i <= end; i++) {
        max = Math.max(max, array[i]);
    }
    return Math.max(max, currentValue);
}
```

| Runtime       | Memory     |
| :------------- | :---------- |
| 117 ms | 39.4 MB	   |



[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF