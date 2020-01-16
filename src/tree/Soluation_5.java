package tree;

import utils.TreeNode;

/**
 * 问题：二叉搜索树中的第k小的元素
 * Link：https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
*/
public class Soluation_5 {
    public int kthSmallest(TreeNode root, int k) {
        while (root != null){
            int left = dfs(root.left) + 1;
            if (k == left){
                return root.val;
            }else if (left > k){
                root = root.left;
            }else {
                k -= left;
                root = root.right;
            }
        }
        return -1;
    }

    public int dfs(TreeNode root){
        if (root == null) return 0;
        return dfs(root.left) + dfs(root.right) + 1;
    }
}
