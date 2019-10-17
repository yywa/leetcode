package leetcodeLCP2;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2019/10/17
 */
public class SolutionOne {
    private static int[] fraction(int[] cont) {
        int denominator = cont[cont.length - 1], numerator = 1;
        int addend = 1;
        for (int i = cont.length - 2; i >= 0; i--) {
            numerator = denominator;
            denominator = cont[i] * denominator + addend;
            addend = numerator;
        }
        return new int[]{denominator, numerator};
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 0, 2};
        System.out.println(Arrays.toString(fraction(a)));
    }
}
