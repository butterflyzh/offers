package tree;

import sun.reflect.generics.tree.Tree;
import utils.TreeNode;

import java.util.*;

/**
 * 问题：对称二叉树
 * Link：https://leetcode-cn.com/problems/symmetric-tree/
 */
public class Soluation_4 {
    public boolean isSymmetric(TreeNode root){
        if (root == null) return true;
        return solve(root.left, root.right);
    }

    private boolean solve(TreeNode L, TreeNode R){
        if (L == null && R == null) return true;
        if (L == null || R == null) return false;
        if (L.val != R.val) return false;
        return solve(L.left, R.right) && solve(L.right, R.left);
    }
}
