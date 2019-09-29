package leetcode357;

/**
 * @author yyw
 * @date 2019/9/29
 * <p>
 * n>10,n位数必然会有数字重复。
 */
public class SolutionOne {
    private static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int[] result = new int[11];
        result[0] = 1;
        int per = 1;
        for (int i = 1; i <= 10; i++) {
            result[i] = result[i - 1] + 9 * per;
            per = per * (10 - i);
        }
        if (n <= 10) {
            return result[n];
        } else {
            return result[10];
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(countNumbersWithUniqueDigits(n));
    }
}
