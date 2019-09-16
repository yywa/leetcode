package leetcode1108;

/**
 * @author yyw
 * @date 2019/9/16
 **/
public class SolutionOne {
    private static String defangIPaddr(String address) {
//        return address.replaceAll("\\.", "\\[.]");
        StringBuilder sb = new StringBuilder();
        char[] chars = address.toCharArray();
        for (char c : chars) {
            if (c == '.') {
                sb.append("[");
                sb.append(c);
                sb.append("]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
