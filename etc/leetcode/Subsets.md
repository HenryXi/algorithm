# Subsets
[Problem Description](https://leetcode.com/problems/subsets/)

```
public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> res = new LinkedList<>();
    res.add(new LinkedList<>());
    for(int i=0;i<nums.length;i++){
        int size = res.size();
        for(int j =0;j<size;j++){
            List<Integer> temp = new LinkedList<>(res.get(j));
            temp.add(nums[i]);
            res.add(temp);
        }
    }
    return res;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 1 ms | 39.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF