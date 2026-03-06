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
    public int maxDepth(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    public int findSum(TreeNode root,int level,int maxDepth)
    {
        if(root==null)
        {
            return 0;
        }
        if(level==maxDepth)
        {
            return root.val;
        }
          return findSum(root.left,level+1,maxDepth) +
               findSum(root.right,level+1,maxDepth);
    }
    public int deepestLeavesSum(TreeNode root) {
        int ans=maxDepth(root);
        return findSum(root,1,ans);
    }
}