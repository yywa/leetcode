package leetcode1300;

import java.util.Arrays;

/**
 * @author yyw
 * @date 2020/6/14
 * @description 转变数组后最接近目标值的数组和
 */
public class SolutionOne {

    public static int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }
        int r = arr[n - 1];
        int ans = 0, diff = target;
        for (int i = 1; i <= r; ++i) {
            int index = Arrays.binarySearch(arr, i);
            if (index < 0) {
                index = -index - 1;
            }
            int cur = prefix[index] + (n - index) * i;
            if (Math.abs(cur - target) < diff) {
                ans = i;
                diff = Math.abs(cur - target);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int target = 10;
        System.out.println();
    }
}
