package leetcode423;

/**
 * @author yyw
 * @date 2019/11/19
 **/
public class SolutionOne {
    private static String originalDigits(String s) {
        char[] count = new char[26 + (int) 'a'];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int[] out = new int[10];
        out[0] = count['z'];
        out[2] = count['w'];
        out[4] = count['o'];
        out[6] = count['x'];
        out[8] = count['g'];
        out[3] = count['h'] - count['8'];
        out[5] = count['f'] - out[4];
        out[7] = count['s'] - out[6];
        out[9] = count['i'] - out[5] - out[6] - out[8];
        out[1] = count['n'] - out[7] - 2 * out[9];

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < out[i]; j++) {
                output.append(i);
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(originalDigits("fviefurofivefivefour"));
    }
}
