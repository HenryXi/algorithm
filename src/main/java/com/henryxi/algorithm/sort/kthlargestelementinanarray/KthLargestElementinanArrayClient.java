package com.henryxi.algorithm.sort.kthlargestelementinanarray;

import java.util.PriorityQueue;

public class KthLargestElementinanArrayClient {
    public static void main(String[] args) {
        KthLargestElementinanArrayClient client = new KthLargestElementinanArrayClient();
        int[] array = new int[]{3, 2, 1, 5, 6, 4};
        System.out.println(client.findKthLargest(array, 2));
    }

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
}
