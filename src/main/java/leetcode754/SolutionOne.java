package leetcode754;

/**
 * @author yyw
 * @date 2019/12/25
 */
public class SolutionOne {
    private static int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0) {
            target -= ++k;
        }
        return target % 2 == 0 ? k : k + 1 + k % 2;
    }

    public static void main(String[] args) {
        System.out.println(reachNumber(2));
    }
}
