# Subsets
[Problem Description](https://leetcode.com/problems/subsets/)

Method 1
```
public List<List<Integer>> subsets2(int[] nums){
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < Math.pow(2, nums.length); i++) {
        ArrayList<Integer> subSet = new ArrayList<>();
        int index = i;
        for (int j = 0; j < nums.length; j++) {
            if ((index & 1) == 1) {
                subSet.add(nums[j]);
            }
            index >>= 1;
        }
        res.add(subSet);
    }
    return res;
}
```

| Runtime | Memory   | 
|:--------|:---------|
| 0 ms    | 40.8 MB	 |


Method 2
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