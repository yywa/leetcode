package leetcode476;

/**
 * @author yyw
 * @date 2019/10/10
 */
public class SolutionOne {
    private static int findComplement(int num) {
        int tmp = num;
        int num2 = 1;
        while (tmp > 0) {
            num2 <<= 1;
            tmp >>= 1;
        }
        num2 -= 1;
        return num ^ num2;

    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
