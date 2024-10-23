// To find out whether the given number is Amstrong or not.

import static java.lang.Math.*;
/* importing using static allows us to directly use the methods pow() sqrt() etc
 else we should use Math.pow() Math.sqrt() every single time
 */

import java.util.Scanner;

public class Bsprg13 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter a number:");
    int gnum = inp.nextInt();
    int n = gnum;
    /* length() cannot be used in primities , so converting int to String 
    to find the length of the given number */
    int e = String.valueOf(n).length();
    int res=0;
    inp.close();

    while(n>0)
    {
      int rem = n%10;
      res+= pow(rem, e);
      n/=10;
    }

    if (gnum == res)
    {
      System.out.println(gnum+" is an Amstrong Number");
    }
    else{
      System.out.println(gnum+" is not an Amstrong Number");
    }


  }
}
