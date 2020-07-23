package leetcode108;

/**
 * @author yyw
 * @date 2020/7/23
 * @description     将有序数组变成高度平衡二叉树。
 */
public class SolutionOne {
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums, 0, nums.length - 1);
    }

    public TreeNode help(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums, left, mid - 1);
        root.right = help(nums, mid + 1, right);
        return root;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}