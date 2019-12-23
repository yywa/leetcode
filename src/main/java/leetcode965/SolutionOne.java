package leetcode965;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyw
 * @date 2019/12/23
 */
public class SolutionOne {
    List<Integer> vals;

    public boolean isUnivalTree(TreeNode root) {
        vals = new ArrayList<>();
        dfs(root);
        for (int v : vals) {
            if (v != vals.get(0)) {
                return false;
            }
        }
        return true;
    }

    public void dfs(TreeNode node) {
        if (node != null) {
            vals.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
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