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
    public TreeNode searchBST(TreeNode curr, int val) {
        while(curr!=null)
        {
            if(curr.val==val)
            {
                return curr;
            }
            else if(curr.val>val)
            curr=curr.left;
            else
            curr=curr.right;
        }
        return null;
    }
}