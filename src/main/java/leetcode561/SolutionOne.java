package leetcode561;

/**
 * @author yyw
 * @date 2019/10/10
 * <p>
 * 暴力遍历法，冒泡排序后，奇数位相加。时间超时。
 */
public class SolutionOne {
    private static int arrayPairSum(int[] nums) {
        int temp, result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
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
