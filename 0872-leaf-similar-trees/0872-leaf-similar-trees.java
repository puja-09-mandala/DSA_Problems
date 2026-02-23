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
    public static void firt(TreeNode root,List<Integer>a)
    {
        if(root==null)
        {
            return ;
        }
        if(root.left==null && root.right==null)
        {
            a.add(root.val);
        }
        firt(root.left,a);
        firt(root.right,a);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        firt(root1,list1);
        firt(root2,list2);
        return list1.equals(list2);
    }
}