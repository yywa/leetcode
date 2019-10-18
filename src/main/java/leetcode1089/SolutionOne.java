package leetcode1089;

/**
 * @author yyw
 * @date 2019/10/18
 */
public class SolutionOne {
    private static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0;
        while (j < n) {
            if (arr[i] == 0) {
                ++j;
            }
            ++i;
            ++j;
        }
        --i;
        --j;
        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                arr[--j] = arr[i];
            }
            --i;
            --j;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(a);
    }
}
