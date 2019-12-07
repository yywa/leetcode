package leetcode316;

import java.util.Stack;

/**
 * @author yyw
 * @date 2019/12/7
 */

public class SolutionOne {
    private static String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (stack.contains(c)) {
                continue;
            } else {
                while (!stack.isEmpty() && stack.peek() > c && s.indexOf(stack.peek(), i) != -1) {
                    stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "cbacdcb";
        System.out.println(removeDuplicateLetters(s));
    }
}
