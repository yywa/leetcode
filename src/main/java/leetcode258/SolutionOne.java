package leetcode258;

/**
 * @author yyw
 * @date 2019/9/11
 **/
public class SolutionOne {
    private static int addDigits(int num) {
        int result = 0;
        while (num > 0) {
            int bit = num % 10;
            result += bit;
            num = num / 10;
        }
        if (result > 9) {
            return addDigits(result);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(addDigits(33));
    }
}
