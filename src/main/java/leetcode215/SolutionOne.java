package leetcode215;

import java.util.PriorityQueue;

/**
 * @author yyw
 * @date 2020/6/29
 * @description 数组中的第K个最大元素
 */
public class SolutionOne {
    public static int findKthLargest(int[] nums, int k) {
        // 默认小顶堆
        PriorityQueue<Integer> heap = new PriorityQueue<>(k);
        for (int num : nums) {
            if (heap.size() < k) {
                heap.offer(num);
            } else {
                if (num > heap.peek()) {
                    heap.poll();
                    heap.offer(num);
                }
            }
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
