package leetcode983;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yyw
 * @date 2020/5/6
 * @description  动态规划，从最后一天往前面规划。
 */
public class SolutionOne {

    private static int[] cost;
    private static Integer[] memo;
    private static Set<Integer> dayset;

    public static int mincostTickets(int[] days, int[] costs) {
        cost = costs;
        memo = new Integer[366];
        dayset = new HashSet<>();
        for (int d : days) {
            dayset.add(d);
        }
        return dp(1);
    }

    public static int dp(int i) {
        if (i > 365) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        if (dayset.contains(i)) {
            memo[i] = Math.min(Math.min(dp(i + 1) + cost[0], dp(i + 7) + cost[1]), dp(i + 30) + cost[2]);
        } else {
            memo[i] = dp(i + 1);
        }
        return memo[i];
    }


    public static void main(String[] args) {
        int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31};
        int[] costs = {2, 7, 15};
        System.out.println(mincostTickets(days, costs));
    }
}
