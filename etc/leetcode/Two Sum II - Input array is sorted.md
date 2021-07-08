# Two Sum II - Input array is sorted
[Problem Description](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

```
public int[] twoSum(int[] numbers, int target) {
    int[] resArray = new int[2];
    int begin = 0;
    int end = numbers.length - 1;
    while (begin <= end) {
        int res = numbers[begin] + numbers[end];
        if (res > target) {
            end--;
            continue;
        }
        if (res < target) {
            begin++;
            continue;
        }
        resArray[0] = begin + 1;
        resArray[1] = end + 1;
        break;
    }
    return resArray;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 38.8 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF