class Solution {
    public boolean bfs(ArrayList<ArrayList<Integer>>graph,int src,int dest,boolean vis[])
    {
    Queue<Integer>q=new LinkedList<>();
    q.add(src);
    while(!q.isEmpty())
    {
        int curr=q.remove();
        if(vis[curr]==false)
        {
            vis[curr]=true;
            for(int i:graph.get(curr))
            {
                q.add(i);
                if(i==dest)
                {
                    return true;
                }
            }
        }
    }
    return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        if(source==destination)
        {
            return  true;
        }
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int e[]:edges)
        {
            int u=e[0];
            int v=e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return bfs(graph,source,destination,new boolean[n]);
    }
}