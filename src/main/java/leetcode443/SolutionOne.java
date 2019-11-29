package leetcode443;

/**
 * @author yyw
 * @date 2019/11/29
 **/
public class SolutionOne {
    private static int compress(char[] chars) {
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c : ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }

    public static void main(String[] args) {
        char[] s = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(s));
    }
}
