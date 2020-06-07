package leetcode128;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yyw
 * @date 2020/6/7
 * @description 最长连续序列
 */
public class SolutionOne {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int result = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                result = Math.max(result, currentStreak);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
