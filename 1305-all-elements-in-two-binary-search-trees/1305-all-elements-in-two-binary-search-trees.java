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
    public void  elemetns(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
         elemetns(root.left);
         ans.add(root.val);
          elemetns(root.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        elemetns(root1);
        elemetns(root2);
        Collections.sort(ans);
        return ans;
    }
}