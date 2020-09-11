# Merge k Sorted Lists
[Problem Description](https://leetcode.com/problems/merge-k-sorted-lists/)

```
public static ListNode mergeKLists(ListNode[] lists){
    if(lists.length == 0){
        return null;
    }
    if(lists.length == 1){
        return lists[0];
    }
    if(lists.length == 2){
        return mergeList(lists[0],lists[1]);
    }
    int mid = lists.length/2;
    ListNode[] l1 = new ListNode[mid];
    for(int i = 0; i < mid; i++){
        l1[i] = lists[i];
    }
    ListNode[] l2 = new ListNode[lists.length-mid];
    for(int i = mid,j=0; i < lists.length; i++,j++){
        l2[j] = lists[i];
    }

    return mergeList(mergeKLists(l1), mergeKLists(l2));
}

public static ListNode mergeList(ListNode l1, ListNode l2) {
    ListNode res = new ListNode(0);
    ListNode cursor = res;
    while (l1 != null && l2 != null) {
        if (l1.val > l2.val) {
            cursor.next = new ListNode(l2.val);
            cursor = cursor.next;
            l2 = l2.next;
        } else {
            cursor.next = new ListNode(l1.val);
            cursor = cursor.next;
            l1 = l1.next;
        }
    }
    if (l1 == null) {
        cursor.next = l2;
    } else {
        cursor.next = l1;
    }
    return res.next;
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 2 ms  | 	40.4 MB   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF