package leetcode136;

/**
 * @author yyw
 * @date 2020/5/14
 * @description 缺少的数字
 */
public class SolutionOne {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int temp : nums) {
            result ^= temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
