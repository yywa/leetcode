package leetcode541;

/**
 * @author yyw
 * @date 2019/10/17
 */
public class SolutionOne {
    private static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        int temp = 0;
        int length = s.length();
        while ((temp + 2 * k) < length) {
            int a = temp + k;
            int b = temp + (2 * k);
            StringBuilder sb1 = new StringBuilder(s.substring(temp, a));
            result.append(sb1.reverse());
            result.append(s, a, b);
            temp = b;
        }
        if (temp < length) {
            int c = length - temp;
            if (c <= k) {
                StringBuilder sb = new StringBuilder(s.substring(temp, length));
                result.append(sb.reverse());
            } else {
                StringBuilder sb = new StringBuilder(s.substring(temp, temp + k));
                result.append(sb.reverse());
                result.append(s, temp + k, length);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
