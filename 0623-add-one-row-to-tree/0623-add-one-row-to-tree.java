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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null)
        {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level=1;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode curr = q.remove();
                if(depth == 1)
                {
                    TreeNode newRoot = new TreeNode(val);
                    newRoot.left = root;
                    return newRoot;
                }
                if(level==depth-1)
                {
                    TreeNode leftR=curr.left;
                    TreeNode rightR=curr.right;
                    curr.left=new TreeNode(val);
                    curr.right=new TreeNode(val);
                    curr.left.left=leftR;
                    curr.right.right=rightR;
                }
                else{
                          if(curr.left != null)
                        q.add(curr.left);
                    if(curr.right != null)
                       q.add(curr.right);
                }
            }
            level++;
        }
        return root;
    }
}