package leetcode409;

/**
 * @author yyw
 * @date 2019/10/15
 */
public class SolutionOne {
    private static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
