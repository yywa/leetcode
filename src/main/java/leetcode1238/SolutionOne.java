package leetcode1238;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yyw
 * @date 2019/11/18
 **/
public class SolutionOne {

    private static List<Integer> circularPermutation(int n, int start) {
        if (n <= 0 || start < 0 || start >= (int) Math.pow(2, n)) {
            return Collections.emptyList();
        }

        List<Integer> list = new ArrayList<>();
        if (n == 1) {
            list.add(start);
            list.add(1 - start);
            return list;
        }
        //生成格雷码
        list.add(0);
        list.add(1);
        int index = start == 1 ? 1 : 0;
        for (int i = 2; i <= n; i++) {
            int temp = list.size();
            for (int j = temp - 1; j >= 0; j--) {
                int value = list.get(j) + (1 << (i - 1));
                list.add(value);
                if (value == start) {
                    index = list.size() - 1;
                }
            }
        }
        //截断格雷码，重排序
        List<Integer> result = new ArrayList<>();
        result.addAll(list.subList(index, list.size()));
        result.addAll(list.subList(0, index));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(circularPermutation(2, 3));
    }
}
