package tree;

import utils.TreeNode;

/**
 * 问题：从根到叶的二进制之和
 * Link：https://leetcode-cn.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
public class Soluation_6 {
    int ans = 0;
    public int sumRootToLeaf(TreeNode root){
        if (root == null) return 0;
        solve(root, 0);
        return ans % (int)(Math.pow(10, 9) + 7);
    }

    private void solve(TreeNode root, int sum){
        if (root == null) return;
        sum = sum * 2 + root.val;
        if (root.left == null && root.right == null){
            ans = ans + sum;
        }else {
            solve(root.left, sum);
            solve(root.right, sum);
        }
    }
}
