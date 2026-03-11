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
          List<List<Integer>>res=new ArrayList<>();
    public void path_to_sum(TreeNode root,int target)
    {
        if(root==null)
        {
            return ;
        }
        path.add(root.val);
        if(root.left==null && root.right==null)
        {
        check_target(path,target);
        }
        path_to_sum(root.left,target);
        path_to_sum(root.right,target);
        path.remove(path.size()-1);
    }
    public void check_target(List<Integer>path,int target)
    {
        int sum=0;
        for(int i=0;i<path.size();i++)
        {
        sum+=path.get(i);
        }
        if(sum==target)
        {
        List<Integer>ans=new ArrayList<>(path);
        res.add(ans);
        }
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        path_to_sum(root,targetSum);
        return res;
    }
}