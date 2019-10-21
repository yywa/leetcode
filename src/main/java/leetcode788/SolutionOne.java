package leetcode788;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2019/10/21
 */
public class SolutionOne {

    private static int rotatedDigits(int N) {
        int res = 0;
        char[] num = {'0', '1', '2', '5', '6', '8', '9'};
        boolean plus = false;
        for (int i = 1; i <= N; i++) {
            char[] c = String.valueOf(i).toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (Arrays.binarySearch(num, c[j]) < 0) {
                    break;
                }
                if (c[j] == '2' || c[j] == '5' || c[j] == '6' || c[j] == '9') {
                    plus = true;
                }
                if (j == c.length - 1 && plus) {
                    res++;
                    plus = false;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(rotatedDigits(10));
    }
}
