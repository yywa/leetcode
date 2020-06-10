package leetcode09;

/**
 * @author yyw
 * @date 2020/6/10
 * @description  判断数字是否是回文数。
 */
public class SolutionOne {
    public static boolean isPalindrome(int x) {
        //判断是否小于0，如果可以整除，那么首位必须是0才是回文数。
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
    }
}
