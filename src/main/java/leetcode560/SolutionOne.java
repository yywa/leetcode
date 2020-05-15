package leetcode560;

/**
 * @author yyw
 * @date 2020/5/15
 * @description 和为k的子数组
 */
public class SolutionOne {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        System.out.println(subarraySum(nums, k));
    }
}
