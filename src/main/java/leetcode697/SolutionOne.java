package leetcode697;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yyw
 * @date 2019/10/15
 */
public class SolutionOne {
    private static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>(16),
                right = new HashMap<>(16), count = new HashMap<>(16);

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            left.putIfAbsent(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }
}
