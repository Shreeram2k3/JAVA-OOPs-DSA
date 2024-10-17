// 8.)Program to To find the occurance n in a given number

import java.util.Scanner;

public class Bsprg08 {
  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);
    System.out.print("Enter the Number:");
    int number = inp.nextInt();
    int gnum = number;
    System.out.print("Enter n:");
    int n = inp.nextInt();
    inp.close();

    int count = 0;
    while(number>0)
    {
      // number %10 gives the last digit of a number
      int rem = number%10;  
      // number/=10 removes the last digit of a number
      number/=10;
      if (rem == n)
      {
        count++;
      }
    }
    System.out.printf("%d Occurs %d times in the number %d",n,count,gnum);
  }
}
