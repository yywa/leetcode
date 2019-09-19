package leetcode67;


/**
 * @author yyw
 * @date 2019/9/19
 **/
public class SolutionOne {
    private static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int ia = a.length() - 1;
        int ib = b.length() - 1;
        int carry = 0;
        while (ia >= 0 || ib >= 0 || carry > 0) {
            carry += (ia >= 0) ? a.charAt(ia--) - '0' : 0;
            carry += (ib >= 0) ? b.charAt(ib--) - '0' : 0;
            res.append(carry % 2);
            carry = carry / 2;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "101";
        System.out.println(addBinary(a, b));
    }
}
