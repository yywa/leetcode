package leetcode832;

/**
 * @author yyw
 * @date 2019/10/11
 */
public class SolutionOne {

    private static int[][] flipAndInvertImage(int[][] A) {
        for (int[] ints : A) {
            invertUsingFor(ints);
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        flipAndInvertImage(A);
    }

    private static int[] invertUsingFor(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] ^= 1;
        }
        return array;
    }
}
