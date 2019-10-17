package leetcode888;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author yyw
 * @date 2019/10/16
 */
public class SolutionOne {
    private static int[] fairCandySwap(int[] A, int[] B) {
        int sa = 0, sb = 0;
        for (int x : A) {
            sa += x;
        }
        for (int x : B) {
            sb += x;
        }
        int delta = (sb - sa) / 2;

        Set<Integer> setB = new HashSet<>();
        for (int x : B) {
            setB.add(x);
        }

        for (int x : A) {
            if (setB.contains(x + delta)) {
                return new int[]{x, x + delta};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] A = {1, 1}, B = {2, 2};
        System.out.println(Arrays.toString(fairCandySwap(A, B)));
    }
}
