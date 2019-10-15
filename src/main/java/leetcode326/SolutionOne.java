package leetcode326;

/**
 * @author yyw
 * @date 2019/10/15
 * <p>
 * 循环
 */
public class SolutionOne {
    private static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(0));
    }
}
