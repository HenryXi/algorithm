# Combination Sum II
[Problem Description](https://leetcode.com/problems/combination-sum-ii/)

```
private List<List<Integer>> res = new LinkedList<>();

public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    loopAfter(candidates, target, 0, new ArrayList<>());
    return res;
}

private void loopAfter(int[] candidates, int target, int start, ArrayList<Integer> list) {
    if (target == 0) {
        res.add(new ArrayList<>(list));
    }
    for (int i = start; i < candidates.length; i++) {
        if (target < candidates[i]) {
            break;
        }
        if (i > start && candidates[i] == candidates[i - 1]) {
            continue;
        }
        list.add(candidates[i]);
        loopAfter(candidates, target - candidates[i], i + 1, list);
        list.remove(list.size() - 1);
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
|  2 ms | 38.6 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF