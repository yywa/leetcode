package leetcode513;

/**
 * @author yyw
 * @date 2019/12/23
 */
public class SolutionOne {
    private int ans = -1;
    /**
     * 记录当前最大高度
     */
    private int max = -1;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    private void dfs(TreeNode root, int h) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (h > max) {
                max = h;
                ans = root.val;
            }
        }
        dfs(root.left, h + 1);
        dfs(root.right, h + 1);
    }

    public static void main(String[] args) {

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
