package leetcode724;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2019/9/19
 **/
public class SolutionOne {
    private static int pivotIndex(int[] nums) {
        int length = nums.length;
        int preSum = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < length; i++) {
            int temp = sum - nums[i];
            if (temp == preSum * 2) {
                return i;
            }
            preSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sum = {1, 7, 3, 6, 5, 6};
        int i = pivotIndex(sum);
        System.out.println(i);
    }
}
