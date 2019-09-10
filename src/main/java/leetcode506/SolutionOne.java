package leetcode506;


import java.io.File;

/**
 * @author yyw
 * @date 2019/9/10
 **/
public class SolutionOne {
    private static String[] findRelativeRanks(int[] nums) {
        String[] s = new String[nums.length];
        int[] level = new int[nums.length];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int max = 0;
            for (int num : nums) {
                if (nums[i] < num) {
                    max++;
                }
            }
            level[i] = max;
        }
        for (int i = 0; i < length; i++) {
            switch (level[i]) {
                case 0:
                    s[i] = "Gold Medal";
                    break;
                case 1:
                    s[i] = "Silver Medal";
                    break;
                case 2:
                    s[i] = "Bronze Medal";
                    break;
                default:
                    s[i] = Integer.toString(level[i] + 1);
                    break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] a = {10, 3, 8, 9, 4};
        findRelativeRanks(a);
    }
}
