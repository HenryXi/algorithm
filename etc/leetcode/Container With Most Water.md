# Container With Most Water
[Problem Description](https://leetcode.com/problems/container-with-most-water/)

```
public static int maxArea(int[] height) {
    int i = 0;
    int j = height.length - 1;
    int area = 0;
    while (i < j) {
        int h = Math.min(height[i], height[j]);
        area = Math.max(area, h * (j - i));
        if (height[i] < height[j]) {
            i++;
        } else {
            j--;
        }
    }
    return area;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 2 ms | 40.8 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF