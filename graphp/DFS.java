class DFS
{
    boolean marked[];
    int edge[];
    public DFS(Graph g, int s)
    {
        marked = new boolean[g.V];
        edge = new int[g.V];
        dfs(g,s);
    }

    void dfs(Graph g, int s)
    {
        marked[s] = true;
        for(int i : g.adjList[s])
        {
            if(marked[i] == false)
            {
                dfs(g,s);
                edge[i] = s;
            }
        }
    }
}