/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inorder(TreeNode root,List<TreeNode>ans)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left,ans);
        ans.add(root);
        inorder(root.right,ans);
    }
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        inorder(root, ans);
        for (int i = 0; i < ans.size(); i++) {
            ans.get(i).left = null;
            if (i + 1 < ans.size()) {
                ans.get(i).right = ans.get(i + 1);
            } else {
                ans.get(i).right = null;
            }
        }
        return ans.get(0);
    }
}