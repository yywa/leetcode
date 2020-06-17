package leetcode1014;

/**
 * @author yyw
 * @date 2020/6/17
 * @description 最佳观光组合
 */
public class SolutionOne {

    public static int maxScoreSightseeingPair(int[] A) {
        int ans = 0;
        int mx = A[0];
        for (int i = 1; i < A.length; ++i) {
            ans = Math.max(ans, mx + A[i] - i);
            mx = Math.max(mx, A[i] + i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 5, 2, 6};
        System.out.println(maxScoreSightseeingPair(nums));
    }
}
