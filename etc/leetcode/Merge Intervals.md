# Merge Intervals
[Problem Description](https://leetcode.com/problems/merge-intervals/)

```
public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    LinkedList<int[]> merged = new LinkedList<>();
    for (int[] array : intervals) {
        if (merged.isEmpty() || merged.getLast()[1] < array[0]) {
            merged.add(array);
        } else {
            merged.getLast()[1] = Math.max(array[1], merged.getLast()[1]);
        }
    }
    return merged.toArray(new int[merged.size()][]);
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 6 ms | 41.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF