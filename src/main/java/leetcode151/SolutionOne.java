package leetcode151;

/**
 * @author yyw
 * @date 2019/8/12
 **/
public class SolutionOne {
    private static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] s1 = s.trim().split(" ");
        int length = s1.length - 1;
        for (int i = length; i >= 0; i--) {
            if (!("").equals(s1[i])) {
                sb.append(s1[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
