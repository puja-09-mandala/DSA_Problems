class Solution {

    public boolean check(List<Integer> ans)
    {
        for(int i=0;i<ans.size()-1;i++)
        {
            if(ans.get(i) >= ans.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
    public boolean check1(List<Integer> ans)
    {
        for(int i=0;i<ans.size()-1;i++)
        {
            if(ans.get(i) <= ans.get(i+1))
            {
                return false;
            }
        }
        return true;
    }

    public boolean isEvenOddTree(TreeNode root) {

        if(root==null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 0;

        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr = q.remove();
                ans.add(curr.val);

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(level%2==0)
            {
                for(int v: ans)
                {
                    if(v%2==0) return false;
                }
                if(!check(ans)) return false;
            }
            else
            {
                for(int v: ans)
                {
                    if(v%2!=0) return false;
                }

                if(!check1(ans)) return false;
            }

            level++;
        }

        return true;
    }
}