// Program to reverse the given number

import java.util.Scanner;

public class Bsprg09 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter  a number:");
    int gnum  = inp.nextInt();
    int tnum = gnum;
    int revnum = 0;
    inp.close();
    
    while(tnum>0)
    {
      int rem = tnum%10;
      revnum = revnum *10 +rem;
      tnum/=10;
    }

    System.out.printf("The reverse of %d is %d",gnum,revnum);
  }
}
