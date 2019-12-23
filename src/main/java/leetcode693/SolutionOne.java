package leetcode693;

/**
 * @author yyw
 * @date 2019/12/23
 */
public class SolutionOne {
    private static boolean hasAlternatingBits(int n) {
        int i = n ^ (n >> 1);
        return (i & (i + 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(10));
    }
}
