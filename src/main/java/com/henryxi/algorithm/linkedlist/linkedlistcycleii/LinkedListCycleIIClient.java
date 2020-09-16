package com.henryxi.algorithm.linkedlist.linkedlistcycleii;

public class LinkedListCycleIIClient {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = l1;
        ListNode listNode = detectCycle(l1);
        System.out.println(listNode.val);
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (true) {
            if (fast == null) {
                return null;
            }
            if (fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        slow = head;
        ListNode circleStar = fast.next;
        while (true) {
            slow = slow.next;
            while (circleStar != fast) {
                fast = fast.next;
                if(slow==fast){
                    return slow;
                }
            }
        }

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

