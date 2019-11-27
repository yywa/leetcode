package leetcode518;

/**
 * @author yyw
 * @date 2019/11/27
 **/
public class SolutionTwo {

    private static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        /**
         * 解题思路- 动态规划
         *
         * 1. 先用1分的兑换，
         * 2. 再使用2分兑换，即不增加1个新2分的方案 + 原本的钱少2分的方案（已包含前面使用的1,2分的方案）
         * 3. 再使用3分兑换，即不增加1个新3分的方案 + 原本的钱少3分的方案（已包含前面使用的1,2，3分的方案）
         */
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] = dp[j] + dp[j - coin];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1, 2, 5};
        System.out.println(change(amount, coins));
    }
}
