package leetcode125;

/**
 * @author yyw
 * @date 2020/6/19
 * @description
 */
public class SolutionOne {
    public static boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        int length = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] == chars[length - i - 1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
