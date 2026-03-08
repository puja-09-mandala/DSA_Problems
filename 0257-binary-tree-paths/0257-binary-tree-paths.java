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
    List<String>path=new ArrayList<>();
    List<String>ans=new ArrayList<>();
    public void print(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        path.add(root.val+"");
        if(root.left==null && root.right==null)
        {
           ans.add(String.join("->", path));
        }
        else{
        print(root.left);
        print(root.right);
        }
        path.remove(path.size()-1); 
    }
    public List<String> binaryTreePaths(TreeNode root) {
        print(root);
        return ans;
    }
}