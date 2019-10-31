package leetcode645;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2019/10/31
 **/
public class SolutionOne {
    private static int[] findErrorNums(int[] nums) {
        int[] out = new int[2];
        int[] count = new int[10002];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) {
                out[0] = i;
            }
            if (count[i] == 0) {
                out[1] = i;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] test = {2, 2};
        System.out.println(Arrays.toString(findErrorNums(test)));
    }
}
