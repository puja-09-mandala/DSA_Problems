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
    public int sum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=sum(root.left);
        int right=sum(root.right);
        return left+right+root.val;
    }
    public int find(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int ans=sum(root);
        return ans;
    }
    public int findTilt(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int ans=find(root.left);
        int ans1=find(root.right);
        int res=Math.abs(ans-ans1);
        return res+findTilt(root.left)+findTilt(root.right);
    }
}