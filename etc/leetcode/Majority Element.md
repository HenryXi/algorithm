# Majority Element
[Problem Description](https://leetcode.com/problems/majority-element/)

```
public int majorityElement(int[] nums) {
    int count = 0;
    int curVote = 0;
    for (int n : nums) {
        if (count == 0) {
            curVote = n;
        }
        count = count + (curVote == n ? 1 : -1);
    }
    return curVote;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 45.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF