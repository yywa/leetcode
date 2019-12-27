package leetcode1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yyw
 * @date 2019/12/27
 */
public class SolutionOne {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        int min = arr[l - 1] - arr[0];
        List<List<Integer>> res = new ArrayList<>();

        // 遍历第一遍找出min gap
        for (int i = 1; i < l; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }

        // 遍历第二遍相邻元素gap与min gap比较即可
        for (int i = 1; i < l; i++) {
            List<Integer> pair = new ArrayList<>();
            if (min == arr[i] - arr[i - 1]) {
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                res.add(pair);
            }
        }
        return res;
    }
}
