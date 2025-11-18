import java.util.Scanner;

public class ReviseBst {
  
  static class Node {

    int value;
    Node left,right;
  
    Node(int val)
    {
      this.value = val;
    }
    
  }

  public static Node insert( Node temp,int val)
  {
    if(temp==null)return new Node(val);

    if(val<temp.value)
    {
      temp.left= insert(temp.left, val);
    }
    else if(val>temp.value)
    {
      temp.right=insert(temp.right, val);
    }

    return temp;
  }

  public static void inOrder(Node temp)
  {
    if(temp==null)return;

    inOrder(temp.left);
    System.out.print(temp.value+" ");
    inOrder(temp.right);
  }

  public static Node delete(Node temp, int val)
  {
    if(temp==null)return null;

    if(val<temp.value)
    {
      temp.left=delete(temp.left, val);
    }
    else if(val>temp.value)
    {
      temp.right=delete(temp.right, val);
    }
    else
    {
      if(temp.left==null&& temp.right==null)return null;

      else if(temp.left==null)return temp.right;

      else if(temp.right==null)return temp.left;

      Node succesor = find(temp.right);
      temp.value = succesor.value;
      temp.right = delete(temp.right, succesor.value);
    }
    return temp;

  }

  public static Node find(Node temp)
  {
    while(temp.left!=null)
    {
      temp = temp.left;
    }
    return temp;
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    int n = inp.nextInt();

    Node root =null;

    for(int i=0;i<n;i++)
    {
      root = insert(root,inp.nextInt());
    }

    System.out.println("After insertion: ");
    inOrder(root);

    System.out.println();
    System.out.println("which node you want to delete?");
    root = delete(root,inp.nextInt());

    System.out.println("After deletion");
    inOrder(root);

  }
  
}
