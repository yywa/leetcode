package leetcode70;

/**
 * @author yyw
 * @date 2020/6/13
 * @description 爬楼梯
 */
public class SolutionOne {

    public static int climbStairs(int n) {
        int f = 1;
        int j = 1;
        int temp = 0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                temp = f + j;
                f = j;
                j = temp;
            }
            return f;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
