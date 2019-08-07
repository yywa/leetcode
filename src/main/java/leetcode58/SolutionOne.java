package leetcode58;

/**
 * @author yyw
 * @date 2019/8/6
 * <p>
 * 执行用时 :7 ms, 在所有 Java 提交中击败了5.02%的用户
 * 内存消耗 :35.4 MB, 在所有 Java 提交中击败了83.04%的用户
 **/
public class SolutionOne {
    private static int lengthOfLastWord(String s) {
        int a = 0;
        String str = s.toLowerCase().trim();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c <= 'z' && c >= 'a') {
                a++;
            } else {
                if (str.lastIndexOf(c) + 1 != str.length()) {
                    a = 0;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("b a "));
    }
}
