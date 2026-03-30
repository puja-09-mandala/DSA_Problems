class Solution {
    public static void dfs(ArrayList<ArrayList<Integer>>graph,int curr,boolean vis[],List<Integer> list)
    {
        vis[curr]=true;
        for(int i:graph.get(curr))
        {
            if(!vis[i])
            {
                list.add(i);
                dfs(graph,i,vis,list);
            }
        }
    }
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int e[]:edges)
        {
            int u = e[0];
            int v = e[1];
            graph.get(v).add(u);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean[] vis = new boolean[n];
            List<Integer> list = new ArrayList<>();
            dfs(graph, i, vis, list);
            Collections.sort(list); 
            ans.add(list);
        }
        return ans;
            }
}