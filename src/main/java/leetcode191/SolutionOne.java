package leetcode191;

/**
 * @author yyw
 * @date 2019/10/11
 */
public class SolutionOne {
    private static int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
}
