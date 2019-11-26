package leetcode861;


/**
 * @author yyw
 * @date 2019/11/26
 **/
public class SolutionOne {
    private static int matrixScore(int[][] A) {
        int R = A.length, C = A[0].length;
        int ans = 0;
        for (int c = 0; c < C; ++c) {
            int col = 0;
            for (int[] ints : A) {
                col += ints[c] ^ ints[0];
            }
            ans += Math.max(col, R - col) * (1 << (C - 1 - c));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] test = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        System.out.println(matrixScore(test));
    }
}
