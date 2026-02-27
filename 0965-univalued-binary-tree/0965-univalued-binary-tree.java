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
    List<Integer>ans=new ArrayList<>();
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        ans.add(root.val);
        if(root.val!=ans.get(0))
        {
           return false;
        }
        return isUnivalTree(root.left)&& isUnivalTree(root.right);
    }
}