package leetcode961;

import java.util.HashSet;

/**
 * @author yyw
 * @date 2019/12/6
 */
public class SolutionOne {

    private static int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : A) {
            if (set.contains(i)) {
                return i;
            } else {
                set.add(i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] temp = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(temp));
    }
}
