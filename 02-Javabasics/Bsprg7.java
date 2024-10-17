// 7.)Program to To calculate Fibonacci Series up to n numbers.

import java.util.*;
public class Bsprg7 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.printf("Enter n:");
    int n = inp.nextInt();
    inp.close();
    int f1 = 0, f2=1,f3;

    System.out.printf("Fibonacci Series upto %d : ",n);
    System.out.printf("%d %d",f1,f2);

    for(int i =2;i<n;i++)
    {
      f3 = f1+f2;
      System.out.printf(" %d ",f3);
      f1 =f2;
      f2 = f3;
    }
  }
}
