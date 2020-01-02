package leetcode1128;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2020/1/2
 */
public class SolutionOne {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans = 0;
        int[] cp = new int[100];
        for (int[] arr : dominoes) {
            Arrays.sort(arr);
            ans += cp[arr[0] * 10 + arr[1]]++;
        }
        return ans;
    }
}
