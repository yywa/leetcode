package leetcode1021;

import java.util.Stack;

/**
 * @author yyw
 * @date 2019/10/11
 */
public class SolutionOne {
    private static String removeOuterParentheses(String S) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int start = 0;
        int end;
        boolean flag = false;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == '(') {
                stack.push(ch);
                if (!flag) {
                    start = i;
                    flag = true;
                }
            }

            if (ch == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    end = i;
                    ans.append(S, start + 1, end);
                    flag = false;
                    start = end;
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
}
