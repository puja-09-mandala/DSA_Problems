class Solution {
    public void dfs(int[][]graph,boolean visit[],int curr,int target,List<Integer>ans,List<List<Integer>>res)
    {
        if(curr==target)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int neigh:graph[curr])
        {
            if(!visit[neigh])
            {
                visit[neigh]=true;
                ans.add(neigh);
                dfs(graph,visit,neigh,target,ans,res);
                ans.remove(ans.size()-1);
                visit[neigh]=false;
            }
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        boolean visit[]=new boolean[graph.length];
        List<Integer>ans=new ArrayList<>();
        ans.add(0);
        visit[0]=true;
        List<List<Integer>>res=new ArrayList<>();
        dfs(graph,visit,0,graph.length-1,ans,res);
        return res;
    }
}