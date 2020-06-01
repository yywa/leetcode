package leetcode1431;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyw
 * @date 2020/6/1
 * @description 拥有最多糖果的孩子
 */
public class SolutionOne {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxCandies = 0;
        for (int i = 0; i < n; ++i) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        List<Boolean> ret = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            ret.add(candies[i] + extraCandies >= maxCandies);
        }
        return ret;
    }
}
