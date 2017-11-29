package com.henryxi.algorithm.linkedlist.findcycle;

import java.util.ArrayList;
import java.util.List;

public class SingleLinkedListNode {
    public SingleLinkedListNode(int value) {
        this.value = value;
    }

    int value;
    SingleLinkedListNode next;

    public static List<SingleLinkedListNode> initSingleLinkedList(int length) {
        List<SingleLinkedListNode> listNodes = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            SingleLinkedListNode node = new SingleLinkedListNode(i);
            listNodes.add(node);
            if (i != 0) {
                listNodes.get(i - 1).next = node;
            }
        }
        return listNodes;
    }
}
