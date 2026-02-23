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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<Double>ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            double avg=0.00;
            double sum=0.00;
            for(int i=1;i<=size;i++)
            {
                TreeNode curr=q.remove();
                sum+=curr.val;  
                if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
            }
            ans.add(sum/size);
            }
        return ans;
    }
}