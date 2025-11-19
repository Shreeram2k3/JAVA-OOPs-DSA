import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfsrevise {
  
  public static void bfs(ArrayList<ArrayList<Integer>> adj, int n, int start)
  {
    boolean[] visited = new boolean[n];
    Queue<Integer> q = new LinkedList<>();

    visited[start]=true;
    q.add(start);

    while(!q.isEmpty())
    {
      int node = q.poll();

      System.out.print(node+" ");

      for(int neighbor : adj.get(node))
      {
        if(!visited[neighbor])
        {
          visited[neighbor]=true;
          q.add(neighbor);
        }
      }
    }

  }
  public static void main(String[] args) {
    
    Scanner inp = new Scanner(System.in);

    int n = inp.nextInt();
    int m = inp.nextInt();

    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      adj.add(new ArrayList<>());
    }

    for(int i=0;i<m;i++)
    {
      int u = inp.nextInt();
      int v = inp.nextInt();

      adj.get(u).add(v);
      

    }

    int source = inp.nextInt();

    bfs(adj,n,source);

  }
}
