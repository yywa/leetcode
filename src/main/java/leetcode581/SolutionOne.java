package leetcode581;

/**
 * @author yyw
 * @date 2019/11/7
 **/
public class SolutionOne {
    private static int findUnsortedSubarray(int[] nums) {
        int l = nums.length, r = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    r = Math.max(r, j);
                    l = Math.min(l, i);
                }
            }
        }
        return r - l < 0 ? 0 : r - l + 1;
    }

    public static void main(String[] args) {
        int[] test = {2, 1};
        System.out.println(findUnsortedSubarray(test));
    }
}
