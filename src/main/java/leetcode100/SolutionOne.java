package leetcode100;

/**
 * @author yyw
 * @date 2019/8/8
 * <p>
 * 执行用时 :0 ms, 在所有 Java 提交中击败了100%的用户
 * 内存消耗 :34.6 MB, 在所有 Java 提交中击败了81.00%的用户
 **/
public class SolutionOne {
    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(1);
        isSameTree(treeNode1, treeNode2);
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