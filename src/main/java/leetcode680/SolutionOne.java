package leetcode680;

/**
 * @author yyw
 * @date 2020/5/19
 * @description  验证回文字符串2
 */
public class SolutionOne {
    public static boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        boolean deleteL = false, deleteR = false;
        while (r > l) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
                continue;
            }
            if (!deleteL) {
                l++;
                deleteL = true;
            } else if (!deleteR) {
                r--;
                l--;
                deleteR = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
    }
}
