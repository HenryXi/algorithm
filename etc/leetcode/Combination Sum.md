# Combination Sum
[Problem Description](https://leetcode.com/problems/combination-sum/)

```
private List<List<Integer>> res = new ArrayList<>();

public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    loopAfter(candidates, target, 0, new ArrayList<>());
    return res;
}

private void loopAfter(int[] candidates, int target, int start, ArrayList<Integer> track) {
    if (target == 0) {
        res.add(new ArrayList<>(track));
        return;
    }
    for (int i = start; i < candidates.length; i++) {
        if (target < candidates[i]) {
            break;
        }
        track.add(candidates[i]);
        loopAfter(candidates, target - candidates[i], i, track);
        track.remove(track.size() - 1);
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 2 ms | 38.9 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF