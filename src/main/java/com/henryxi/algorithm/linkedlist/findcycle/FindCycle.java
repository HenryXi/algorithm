package com.henryxi.algorithm.linkedlist.findcycle;

import java.util.List;

/**
 * judge single linked list is dead list(contain cycle)
 */
public class FindCycle {
    public static void main(String[] args) {
        List<SingleLinkedListNode> listNodes = SingleLinkedListNode.initSingleLinkedList(20);
        SingleLinkedListNode endNode = listNodes.get(19);
        endNode.next = listNodes.get(6);
        SingleLinkedListNode root = listNodes.get(0);
        System.out.println(isCycle(root));
    }

    private static boolean isCycle(SingleLinkedListNode node) {
        if (node == null || node.next == null || node.next.next == null) {
            return false;
        }
        SingleLinkedListNode slowPointer = node.next;
        SingleLinkedListNode quickPointer = node.next.next;
        while (slowPointer != null && quickPointer != null && quickPointer.next != null) {
            if (slowPointer.value == quickPointer.value) {
                return true;
            }
            slowPointer = slowPointer.next;
            quickPointer = quickPointer.next.next;
        }
        return false;
    }
}
