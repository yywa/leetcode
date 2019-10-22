package leetcode806;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2019/10/22
 */
public class SolutionOne {
    private static int[] numberOfLines(int[] widths, String S) {
        int[] result = new int[]{1, 0};
        int temp = 0;
        for (char c : S.toCharArray()) {
            temp += widths[c - 'a'];
            if (temp > 100) {
                result[0]++;
                temp = widths[c - 'a'];
            }
        }
        result[1] = temp;
        return result;
    }

    public static void main(String[] args) {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(Arrays.toString(numberOfLines(widths, S)));
    }
}
