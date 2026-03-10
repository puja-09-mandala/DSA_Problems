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
    List<Integer>path=new ArrayList<>();
    public void Root_to_leaf(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        path.add(root.val);
        if(root.left==null && root.right==null)
        {
            solve(path);
        }
        Root_to_leaf(root.left);
        Root_to_leaf(root.right);
        path.remove(path.size()-1);
    }
    int sum=0;
    public void  solve(List<Integer>path)
    {
        if(path.isEmpty())
        {
            return ;
        }
        int ans=0;
        for(int i=0;i<path.size();i++)
        {
            ans=ans*10+path.get(i);
        }
        sum+=ans;
    }
    public int sumNumbers(TreeNode root) {
       Root_to_leaf(root);
       return sum;
    }
}