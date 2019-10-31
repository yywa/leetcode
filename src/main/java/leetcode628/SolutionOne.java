package leetcode628;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2019/10/31
 **/
public class SolutionOne {
    private static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return Math.max(nums[0]*nums[1]*nums[length-1],nums[length-3]*nums[length-1]*nums[length-2]);
    }
    public static void main(String[] args) {
        int[] test = {1,2,3,4};
        System.out.println(maximumProduct(test));
    }
}
