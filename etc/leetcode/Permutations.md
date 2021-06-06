# Permutations
[Problem Description](https://leetcode.com/problems/permutations/submissions/)

```
public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> l = new LinkedList<>();
    permute(nums, 0, l);
    return l;
}

private static void permute(int[] nums, int p, List<List<Integer>> l) {
    if (p + 1 == nums.length) {
        List<Integer> ll = new LinkedList<>();
        for (int num : nums) {
            ll.add(num);
        }
        l.add(ll);
        return;
    }
    for (int i = p; i < nums.length; i++) {
        swap(nums, p, i);
        permute(nums, p + 1, l);
        swap(nums, p, i);
    }
}

private static void swap(int[] nums, int i, int j) {
    if (i == j) {
        return;
    }
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 0 ms | 39 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF