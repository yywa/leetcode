package leetcode77;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyw
 * @date 2019/8/6
 *
 * 深度优先遍历
 **/
public class SolutionOne {

    private static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        dfs(res, tmp, n, k, 1);
        return res;
    }

    private static void dfs(List<List<Integer>> res, List<Integer> tmp, int n, int k, int m) {
        if (k == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = m; i <= n; i++) {
            tmp.add(i);
            dfs(res, tmp, n, k - 1, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        combine(3, 2);
    }
}
