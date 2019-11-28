package leetcode322;

/**
 * @author yyw
 * @date 2019/11/28
 **/
public class SolutionOne {

    private static int coinChange(int[] coins, int amount) {
        int[] f = new int[amount + 1];
        f[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int cost = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin >= 0) {
                    if (f[i - coin] != Integer.MAX_VALUE) {
                        cost = Math.min(cost, f[i - coin] + 1);
                    }
                }
            }
            f[i] = cost;
        }

        return f[amount] == Integer.MAX_VALUE ? -1 : f[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
