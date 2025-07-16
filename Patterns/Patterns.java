package Patterns;
import java.util.Scanner;

public class Patterns {

  
public static void pat1(int n )
  {
    // ****
    // ****
    // ****
    // ****
    for(int i = 0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n = inp.nextInt();
    pat1(n);
  }


}
