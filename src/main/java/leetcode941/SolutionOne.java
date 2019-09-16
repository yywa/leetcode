package leetcode941;

/**
 * @author yyw
 * @date 2019/9/12
 **/
public class SolutionOne {
    private static boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;
        while (i + 1 < N && A[i] < A[i + 1]){
            i++;
        }
        if (i == 0 || i == N - 1){
            return false;
        }
        while (i + 1 < N && A[i] > A[i + 1]){
            i++;
        }
        return i == N - 1;
    }

    public static void main(String[] args) {
        int[] a = {0, 3, 2, 1};
        System.out.println(validMountainArray(a));
    }
}
