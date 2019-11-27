package leetcode872;

import java.util.ArrayList;

/**
 * @author yyw
 * @date 2019/11/27
 */

public class SolutionOne {

    private static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        getLeaf(root1, list1);
        getLeaf(root2, list2);
        return list1.equals(list2);
    }


    private static void getLeaf(TreeNode node, ArrayList<Integer> list) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                list.add(node.val);
            }
            getLeaf(node.left, list);
            getLeaf(node.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        System.out.println(leafSimilar(a, b));
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