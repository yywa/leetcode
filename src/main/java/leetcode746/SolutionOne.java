package leetcode746;

/**
 * @author yyw
 * @date 2019/8/7
 * <p>
 * 执行用时 :2 ms, 在所有 Java 提交中击败了96.98%的用户
 * 内存消耗 :37.2 MB, 在所有 Java 提交中击败了89.87%的用户
 * <p>
 * 动态规划
 **/
public class SolutionOne {
    private static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return cost[0];
        }
        for (int i = n - 3; i >= 0; i--) {
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        }
        return Math.min(cost[0], cost[1]);
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(minCostClimbingStairs(num));

    }
}
