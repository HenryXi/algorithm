# Next Greater Node In Linked List
[Problem Description](https://leetcode.com/problems/next-greater-node-in-linked-list/)

```
public static int[] nextLargerNodes(ListNode head) {
    if (head == null) {
        return null;
    }
    ArrayList<Integer> list = new ArrayList<>();
    while (head != null) {
        list.add(head.val);
        head = head.next;
    }
    Stack<Integer> stack = new Stack<>();
    int[] ans = new int[list.size()];
    for (int i = list.size() - 1; i >= 0; i--) {
        while (!stack.empty() && stack.peek() <= list.get(i)) {
            stack.pop();
        }
        ans[i] = stack.empty() ? 0 : stack.peek();
        stack.push(list.get(i));
    }
    return ans;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
|  14 ms | 40.5 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF