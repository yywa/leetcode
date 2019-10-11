package leetcode1021;

/**
 * @author yyw
 * @date 2019/10/11
 */
public class SolutionTwo {
    private static String removeOuterParentheses(String S) {
        int L = 1, R = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < S.length(); ++i) {
            if (S.charAt(i) == ')') {
                ++R;
                if (L == R) {
                    L = 1;
                    R = 0;
                    ++i;
                } else {
                    sb.append(S.charAt(i));
                }
            } else {
                sb.append(S.charAt(i));
                ++L;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
}
