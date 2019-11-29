package leetcode977;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2019/11/29
 **/
public class SolutionOne {
    private static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
