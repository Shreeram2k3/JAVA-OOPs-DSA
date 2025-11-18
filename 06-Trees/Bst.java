// inserstion, inOrder, preOrder, postOrder Traversals, deleting a node in BST 

import java.util.Scanner;

// creating Node class 
public class Bst {

  static class Node 
  {
    int value;
    Node left, right;

    Node (int val)
    {
      this.value = val;
    }
  }
//  code to insert nodes in bst 
  public static Node insert(Node temp, int val)
  {
    if(temp==null) return new Node(val);

    if(val<temp.value)
    {
      temp.left = insert(temp.left, val);
    }
    else if(val> temp.value)
    {
      temp.right = insert(temp.right, val);
    }
    return temp;
  }

  public static void inOrder(Node temp)
  {
    if(temp==null) return;

    inOrder(temp.left);
    System.out.print(temp.value+" ");
    inOrder(temp.right);
  }

  public static void preOrder(Node temp)
  {
    if(temp==null) return;

    System.out.print(temp.value+" ");
    preOrder(temp.left);
    preOrder(temp.right);
  }
  public static void postOrder(Node temp)
  {
    if(temp==null) return;

    postOrder(temp.left);
    postOrder(temp.right);
    System.out.print(temp.value+" ");
  }
  
public static Node delete(Node temp, int val)
{
  if(temp==null) return temp;

  if(val<temp.value)
  {
    temp.left = delete(temp.left, val);
  }
  else if(val>temp.value)
  {
    temp.right = delete(temp.right, val);
  }
  else
  {
    // no child on both sides 
    if(temp.left==null && temp.right==null)
    {
      return null;
    }
    
    // one child on either  left/right 
    else if(temp.right==null)
    {
      return temp.left;
    }
    else if(temp.left==null)
    {
      return temp.right;
    }

    // 2 childrens

    Node successor = findMin(temp.right);
    temp.value = successor.value;
    temp.right = delete(temp.right, successor.value);

    

  }
  return temp;
}

  public static Node findMin(Node temp)
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

   inOrder(root);

   System.out.println("after deletion:");
   delete(root, inp.nextInt());
   inOrder(root);
   inp.close();
  }
  
}
