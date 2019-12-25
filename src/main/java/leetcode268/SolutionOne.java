package leetcode268;

/**
 * @author yyw
 * @date 2019/12/25
 */
public class SolutionOne {
    private static int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= i ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(missingNumber(nums));
    }
}
