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
     HashMap<Integer,Integer>hp=new HashMap<>();
    public int find(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int result=find(root.left)+find(root.right)+root.val;
        hp.put(result,hp.getOrDefault(result,0)+1);
        return result;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        int maxx=0;
        find(root);
        for(int i:hp.keySet())
        {
            if(hp.get(i)>maxx)
            {
                maxx=hp.get(i);
            }
        }
        List<Integer>ans=new ArrayList<>();
       for(int i:hp.keySet())
       {
        if(maxx==hp.get(i))
        {
           ans.add(i);
        }
       }
       int arr[]=new int[ans.size()];
       for(int i=0;i<ans.size();i++)
       {
        arr[i]=ans.get(i);
       }
       return arr;
    }
}