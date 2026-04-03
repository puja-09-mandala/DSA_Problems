import java.util.*;

class Solution {
    public int bfs(ArrayList<ArrayList<Integer>> graph, int start, int n) {
        int[] dist = new int[n];
        int[] parent = new int[n];
        Arrays.fill(dist, -1);
        Arrays.fill(parent, -1);
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        dist[start] = 0;
        
        int minCycle = Integer.MAX_VALUE;
        
        while(!q.isEmpty()) {
            int u = q.poll();
            for(int v : graph.get(u)) {
                if(dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    parent[v] = u;
                    q.offer(v);
                }
                else if(parent[u] != v) {
                    int cycle = dist[u] + dist[v] + 1;
                    minCycle = Math.min(minCycle, cycle);
                }
            }
        }
        return minCycle;
    }

    public int findShortestCycle(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int e[] : edges) {
            int u = e[0];
            int v = e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        } 
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int res = bfs(graph, i, n);
            ans = Math.min(ans, res);
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}