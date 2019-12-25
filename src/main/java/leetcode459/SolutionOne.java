package leetcode459;

/**
 * @author yyw
 * @date 2019/12/25
 */
public class SolutionOne {
    private static boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }
}
