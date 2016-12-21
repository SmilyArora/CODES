import java.util.*;

public class CC
{
    final int cc[];
    final boolean marked[];
    int count ;
    public CC(Graph g)
    {
        cc = new int[g.V];
        marked = new boolean[g.V];
        for(int i = 0; i < g.V; i++)
        {
            if(!marked[i])
            {
                dfs(g,i);
                count++;
            }
        }
    }

    public void dfs(Graph g, int s)
    {
        marked[s] = true;
        cc[s] = count;
        for(int k : g.adjList[s])
        {
            if(!marked[k])
            {
                dfs(g,k);
            }
        }
    }

     public int[] getCc() 
     {
        return cc;
     }
}