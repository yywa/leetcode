package leetcode66;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2019/9/19
 **/
public class SolutionOne {
    private static int[] plusOne(int[] digits) {
        int length = digits.length - 1;
        for (int i = length; i >= 0; i--) {
            int sum = digits[i] + 1;
            if (sum == 10) {
                digits[i] = 0;
            } else {
                digits[i] = sum;
                return digits;
            }
        }
        int[] res = new int[length + 2];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] a = {9, 9};
        System.out.println(Arrays.toString(plusOne(a)));
    }
}
