# Get Least Numbers
[Problem Description](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/)

```
public int[] getLeastNumbers(int[] arr, int k) {
    Arrays.sort(arr);
    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
        res[i] = arr[i];
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 8 ms | 39.7 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF