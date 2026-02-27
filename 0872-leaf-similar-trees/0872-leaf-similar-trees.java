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
    public List<Integer> sequence(TreeNode root1,List<Integer>ans)
    {
        if(root1==null)
        {
            return ans;
        }
        if(root1.left==null && root1.right==null)
        {
            ans.add(root1.val);
        }
        sequence(root1.left,ans);
        sequence(root1.right,ans);
        return ans;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
     List<Integer>ans=new ArrayList<>();
     List<Integer>ans1=new ArrayList<>();
    ans=sequence(root1,ans);
    ans1=sequence(root2,ans1);
     return ans.equals(ans1);
    }
}