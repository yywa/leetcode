package leetcode1207;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yyw
 * @date 2020/1/2
 */
public class SolutionOne {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(8);
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
        }
        int i1 = map.values().stream().distinct().mapToInt(i -> i).sum();
        int i2 = map.values().stream().mapToInt(i -> i).sum();
        return i1 == i2;
    }
}
