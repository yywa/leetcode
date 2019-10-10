package leetcode561;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2019/10/10
 */
public class SolutionTwo {
    private static int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            result = result + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }
}
