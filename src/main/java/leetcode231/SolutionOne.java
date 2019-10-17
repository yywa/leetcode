package leetcode231;

/**
 * @author yyw
 * @date 2019/10/17
 */
public class SolutionOne {
    private static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(218));
    }
}
