# Find Continuous Sequence
[Problem Description](https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/)

```
public int[][] findContinuousSequence(int target) {
    List<int[]> res = new LinkedList<>();
    int left = 1;
    int right = 2;
    while (left < right) {
        int countOfNum = right - left + 1;
        int sum = (left + right) * countOfNum / 2;
        if (sum == target) {
            int[] seq = new int[countOfNum];
            for (int i = 0; i < seq.length; i++) {
                seq[i] = left + i;
            }
            res.add(seq);
            left++;
        } else if (sum > target) {
            left++;
        } else {
            right++;
        }
    }
    return res.toArray(new int[res.size()][]);
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 4 ms | 36.2 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF