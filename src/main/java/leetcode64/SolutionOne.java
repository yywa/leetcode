package leetcode64;

/**
 * @author yyw
 * @date 2020/6/2
 * @description 求1+2+…+n
 */
public class SolutionOne {
    public static int sumNums(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumNums(3));
    }
}
