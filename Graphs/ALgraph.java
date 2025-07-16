// java prg to store a undirected graph in an Adjacency List and print it



import java.util.ArrayList;

public class ALgraph {
  public static void main(String[] args) {
    
    // n is the no.of. nodes &  m is the no.of. edges in graph   
    int n = 5 , m=6;

    ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

    for (int i = 0; i <=n; i++) {

      adjList.add(new ArrayList<Integer>());

    }
    // Adding nodes and edges to the adjList

    // edge 1-2
    adjList.get(1).add(2);
    adjList.get(2).add(1);
    
    
    // edge 1-3
    adjList.get(1).add(3);
    adjList.get(3).add(1);

    
    // edge 3-4
    adjList.get(3).add(4);
    adjList.get(4).add(3);

    
    // edge 2-4
    adjList.get(2).add(4);
    adjList.get(4).add(2);

    
    // edge 2-5
    adjList.get(2).add(5);
    adjList.get(5).add(2);

    
    // edge 4-5
    adjList.get(4).add(5);
    adjList.get(5).add(4);

    // displaying the Graph 

    for (int i = 1; i <=n; i++) {
      for (int j : adjList.get(i)) {

        System.out.print(j+ " ");
        
      }
      System.out.println();
      
    }

  }
}
