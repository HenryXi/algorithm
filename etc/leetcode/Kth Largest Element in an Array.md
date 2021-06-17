# Kth Largest Element in an Array
[Problem Description](https://leetcode.com/problems/kth-largest-element-in-an-array/)

```
public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a.compareTo(b));
    for (int i = 0; i < nums.length; i++) {
        minHeap.add(nums[i]);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
    }
    return minHeap.poll();
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 4 ms | 39 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF