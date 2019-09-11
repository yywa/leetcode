package leetcode236;

/**
 * @author yyw
 * @date 2019/9/11
 **/
public class SolutionOne {
    private static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 3 == 0) {
                num = num / 3;
            } else if (num % 5 == 0) {
                num = num / 5;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(905391974));
    }
}
