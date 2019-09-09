package leetcode1029;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author yyw
 * @date 2019/9/9
 **/
public class SolutionOne {
    private static int twoCitySchedCost(int[][] costs) {
        int result = 0;
        ArrayList<Integer> leftList = new ArrayList();
        ArrayList<Integer> rightList = new ArrayList();
        for (int[] a : costs) {
            if (a[0] < a[1]) {
                result += a[0];
                leftList.add(a[1] - a[0]);
            } else if (a[0] > a[1]) {
                result += a[1];
                rightList.add(a[0] - a[1]);
            } else {
                result += a[0];
            }
        }
        int left = leftList.size();
        int right = rightList.size();
        if (left > right) {
            int temp = (left - right) / 2;
            Collections.sort(leftList);
            for (int i = 0; i < temp; i++) {
                result += leftList.get(i);
            }
        } else {
            int temp = (right - left) / 2;
            Collections.sort(rightList);
            for (int i = 0; i < temp; i++) {
                result += rightList.get(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{518, 518}, {71, 971}, {121, 862}, {967, 607}, {138, 754}, {513, 337}, {499, 873}, {337, 387}, {647, 917}, {76, 417}};
        System.out.println(twoCitySchedCost(a));
    }
}
