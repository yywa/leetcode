package leetcode915;

/**
 * @author yyw
 * @date 2019/11/27
 **/
public class SolutionOne {
    private static int partitionDisjoint(int[] A) {
        int length = A.length;
        int[] maxLeft = new int[length];
        int[] minRight = new int[length];
        int m = A[0];
        for (int i = 0; i < length; i++) {
            m = Math.max(m, A[i]);
            maxLeft[i] = m;
        }
        m = A[length - 1];
        for (int i = length - 1; i >= 0; i--) {
            m = Math.min(m, A[i]);
            minRight[i] = m;
        }
        for (int i = 1; i < length; i++) {
            if (maxLeft[i - 1] <= minRight[i]) {
                return i;
            }
        }
        throw null;
    }

    public static void main(String[] args) {
        int[] temp = {5, 0, 3, 8, 6};
        System.out.println(partitionDisjoint(temp));
    }
}
