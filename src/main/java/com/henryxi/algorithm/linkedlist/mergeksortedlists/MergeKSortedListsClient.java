package com.henryxi.algorithm.linkedlist.mergeksortedlists;

/**
 * https://leetcode-cn.com/problems/merge-k-sorted-lists/
 */
public class MergeKSortedListsClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode[] lists = new ListNode[]{l1, l2};
        mergeKLists(lists);
    }

//    public static ListNode mergeKLists(ListNode[] lists) {
//        ListNode res= new ListNode(Integer.MIN_VALUE);
//        for (int i = 0; i < lists.length; i++) {
//            res = mergeList(lists[i], res);
//        }
//        return res.next;
//    }

    /**
     * 简单循环是O(n)  折半递归是O(nlogn)
     * @param lists
     * @return
     */
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
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
