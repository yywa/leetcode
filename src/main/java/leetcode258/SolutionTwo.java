package leetcode258;

/**
 * @author yyw
 * @date 2019/9/11
 **/
public class SolutionTwo {

    private static int addDigits(int num) {
        if (num > 0) {
            return num % 9 == 0 ? 9 : num % 9;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(33));
    }
}
