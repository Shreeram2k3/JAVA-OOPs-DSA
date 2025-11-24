import java.util.*;


public class NaryTrees {
  
  static class Node{
    int value;
    List<Node> children = new ArrayList<>();

    Node(int val)
    {
      this.value = val;
    }
  }

  public static Node addChild(Node parent,int val)
  {
    Node child = new Node(val);
    parent.children.add(child);
    return child;
  }

  public static void preOrder(Node temp)
  {
    if(temp ==null) return;

    System.out.print(temp.value+" ");

    for(Node child : temp.children)
    {
      preOrder(child);
    }

  }

  public static void postOrder(Node temp)
  {
    if(temp ==null) return;

    
    for(Node child : temp.children)
      {
        postOrder(child);
      }
      
      System.out.print(temp.value+" ");
  }

  // BFS - level Order Traversal
  public static void bfs(Node root)
{
    if(root == null) return;

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while(!q.isEmpty())
    {
        Node curr = q.poll();
        System.out.print(curr.value + " ");

        for(Node child : curr.children)
        {
            q.add(child);
        }
    }
}

  public static void main(String[] args) {
    
    // creating the root elem 
    Node root = new Node(1);

    // adding children to parents accordingly 
    Node a = addChild(root, 2);
    Node b = addChild(root, 3);
    Node c = addChild(root, 4);

    Node d = addChild(a, 5);
    Node e = addChild(a, 6);
    Node f = addChild(a, 7);

    Node g = addChild(b, 8);
    Node h = addChild(b, 9);
    Node i = addChild(b, 10);

    Node j = addChild(c, 11);
    Node k = addChild(c, 12);
    Node l = addChild(c, 13);

    // DFS Traversals
    System.out.println("PreOrder: ");
    preOrder(root);

    System.out.println();

    System.out.println("postOrder: ");
    postOrder(root);
    System.out.println();

    // BFS 
    System.out.println("BFS travel: ");
    bfs(root);



  }

}
