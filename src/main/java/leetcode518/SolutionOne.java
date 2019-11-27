package leetcode518;

/**
 * @author yyw
 * @date 2019/11/26
 **/
public class SolutionOne {
    // TODO: 2019/11/27 多理解理解 
    private static int change(int amount, int[] coins) {
        int len = coins.length;
        int[][] dp = new int[len + 1][amount + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j <= amount; j++) {
                for (int k = 0; j - k * coins[i - 1] >= 0; k++) {
                    dp[i][j] += dp[i - 1][j - k * coins[i - 1]];
                }
            }
        }
        return dp[len][amount];
    }

    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1, 2, 5};
        System.out.println(change(amount, coins));
    }
}
