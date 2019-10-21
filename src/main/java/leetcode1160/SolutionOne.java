package leetcode1160;

/**
 * @author yyw
 * @date 2019/10/21
 */
public class SolutionOne {
    private static int countCharacters(String[] words, String chars) {
        int[] temp = new int[26];
        int result = 0;
        for (char c : chars.toCharArray()) {
            temp[c - 'a']++;
        }
        for (String s : words) {
            int[] clone = temp.clone();
            int a = 0;
            for (char c : s.toCharArray()) {
                if (clone[c - 'a']-- > 0) {
                    a++;
                }
            }
            if (a == s.length()) {
                result += a;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }
}
