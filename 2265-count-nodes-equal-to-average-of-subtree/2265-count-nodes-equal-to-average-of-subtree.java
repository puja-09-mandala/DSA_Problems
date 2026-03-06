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
    public int count(TreeNode root)
    {
        if(root==null)
        return 0;
        int l=count(root.left);
        int r=count(root.right);
        return l+r+1;
    }
    public int sum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=sum(root.left);
        int r=sum(root.right);
        return l+r+root.val;
    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int summ=sum(root);
        int c=count(root);
        int avg=summ/c;
        int countt=0;
        if(avg==root.val)
        {
            countt++;
        }
        return countt+averageOfSubtree(root.left)+averageOfSubtree(root.right);
    }
}