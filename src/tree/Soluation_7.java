package tree;

import utils.TreeNode;

/**
 * 问题：二叉搜索树的最近公共祖先
 * Link：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/submissions/
 */
public class Soluation_7 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
