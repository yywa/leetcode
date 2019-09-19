package leetcode747;


/**
 * @author yyw
 * @date 2019/9/19
 **/
public class SolutionOne {
    private static int dominantIndex(int[] nums) {
        int max = 0;
        int secondMax = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                result = i;
            } else {
                if (nums[i] > secondMax) {
                    secondMax = nums[i];
                }
            }
        }
        int temp = secondMax * 2;
        if (temp <= max) {
            return result;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 0, 3, 2};
        System.out.println(dominantIndex(a));
    }
}
