package leetcode905;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2019/10/10
 */
public class SolutionOne {
    private static int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int[] result = new int[length];
        int begin = 0;
        int end = length - 1;
        for (int value : A) {
            boolean b = value % 2 == 0;
            if (b) {
                result[begin] = value;
                begin++;
            } else {
                result[end] = value;
                end--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
