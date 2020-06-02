package leetcode64;

/**
 * @author yyw
 * @date 2020/6/2
 * @description
 */
public class SolutionTwo {
    public static int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(sumNums(3));
    }
}
