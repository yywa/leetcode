package leetcode509;

/**
 * @author yyw
 * @date 2019/8/7
 * <p>
 * 执行用时 :22 ms, 在所有 Java 提交中击败了5.04%的用户
 * 内存消耗 :33.3 MB, 在所有 Java 提交中击败了58.06%的用户
 * 斐波那契数列
 **/
public class SolutionOne {
    private static int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
