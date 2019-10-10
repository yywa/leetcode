package leetcode557;

/**
 * @author yyw
 * @date 2019/10/10
 */
public class SolutionOne {
    private static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String str : s1) {
            StringBuilder temp = new StringBuilder();
            temp.append(str);
            temp.reverse();
            result.append(temp).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
