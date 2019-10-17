package leetcode342;

/**
 * @author yyw
 * @date 2019/10/17
 */
public class SolutionOne {
    private static boolean isPowerOfFour(int num) {
        return (num & 0xaaaaaaaa) == 0 && Integer.bitCount(num) == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(4));
    }
}
