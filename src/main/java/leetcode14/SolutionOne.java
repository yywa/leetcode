package leetcode14;

/**
 * @author yyw
 * @date 2020/6/15
 * @description 最长公共前缀
 */
public class SolutionOne {
    public static String longestCommonPrefix(String[] strs) {
        int index = 0;
        if (strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char current = strs[0].charAt(index);
            for (String str : strs) {
                if (str.length() == i || current != str.charAt(index)) {
                    return str.substring(0, index);
                }
            }
            index++;
        }
        return strs[0].substring(0, index);
    }

    public static void main(String[] args) {
        String[] test = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(test));
    }
}
