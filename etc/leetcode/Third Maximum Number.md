# Third Maximum Number
[Problem Description](https://leetcode.com/problems/third-maximum-number/)

```
public int thirdMax(int[] nums) {
    TreeSet<Integer> treeSet = new TreeSet<>();
    for (int num : nums) {
        treeSet.add(num);
        if (treeSet.size() > 3) {
            treeSet.remove(treeSet.first());
        }
    }
    return treeSet.size() == 3 ? treeSet.first() : treeSet.last();
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 14 ms | 42 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF