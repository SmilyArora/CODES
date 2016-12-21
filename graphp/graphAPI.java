import java.io.*;
import java.util.*;

class Graph
{
    int V, E;
    Bag []adjList;
    Graph(int n)
    {
        adjList = new Bag[n];
        for(int i = 0; i < n; i++)
        {
            adjList[i] = new Bag();
        }
        this.E = 0;
        this.V = n;
    }
    public void addEdge(int v, int w)
    {
        this.adjList[v].enqueue(w);
        this.adjList[w].enqueue(v);
    }
}

class Node
{
    int data;
    Node next;
    Node(int n)
    {
        this.data = n;
        this.next = null;
    }
}

class Bag implements Iterable<Integer>
{
    Node first, last;
    int size;
    Bag()
    {
        size = 0;
    }
    void enqueue(int n)
    {
        Node curr = last;
        last = new Node(n);
        if(size == 0)
        {
            first = last;
        }
        else
        {
            curr.next = last;
        }
        size++;
    }

    public Iterator<Integer> iterator()
    {
        return new BagIterator();
    }

    class BagIterator implements Iterator<Integer>
    {
        Node curr = first;
        public boolean hasNext()
        {
            return (curr.next != null);
        }
        public Integer next()
        {
            Integer temp;
            temp = curr.data;
            curr = curr.next;
            return temp;
        }
        public void remove()
        {
            //do nothing
        }
    }
}
 class CC
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
class graphCheck
{
    public static void main(String args[])
    {
       /* Graph gp = new Graph(6);
        gp.addEdge(1,0);
        gp.addEdge(1,2);
        gp.addEdge(0,2);
        gp.addEdge(0,3);
        gp.addEdge(3,5);
        gp.addEdge(2,4); 
        BFS bfs = new BFS(gp, 0);
        DFS dfs = new DFS(gp, 0);*/
        Graph g = new Graph(13);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 5);
        g.addEdge(0, 6);
        g.addEdge(5, 3);
        g.addEdge(5, 4);
        g.addEdge(4, 3);
        g.addEdge(4, 6);
        g.addEdge(7, 8);
        g.addEdge(9, 10);
        g.addEdge(9, 11);
        g.addEdge(9, 12);
        g.addEdge(11, 12);
        CC cc = new CC(g);
        int[] ccArray = cc.getCc();
        for (int i = 0; i < 13; i++) {
            System.out.println(ccArray[i]);
        }
    }
}