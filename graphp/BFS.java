import java.io.*;
import java.util.*;

class BFS
{
    boolean marked[];
    int edge[];
    BFS(Graph g, int s)
    {
        marked = new boolean[g.V];
        edge = new int[g.V];
        bfs(g,s);
    }

    void bfs(Graph g, int s)
    {
       Queue<Integer> q = new LinkedList<Integer>();    
       q.add(s);
       while(!q.isEmpty())
       {
           int x = q.remove();
           marked[x] = true;
           for(int y : g.adjList[x])
           {
               if(marked[y] != true)
               {
                   q.add(y);
                   marked[y] = true;
                   edge[y] = x;
               }
           }
       }
    }
}