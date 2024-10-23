// Program to Check Leap Year Or Not
    /* NOTE:
    A year is a leap Year if:
      it  is divisible by 4,Except for years divisible by 100,
      it is divisible by 400
      */
import java.util.Scanner;

public class Bsprg14 {
  public static void main(String[] args) {
   Scanner inp  = new Scanner(System.in);
   System.out.print("Enter an Year:");
   int year = inp.nextInt();
   inp.close();

   if(year%4== 0 && year%100!=0||year%400==0)
   {
    System.out.println(year+" is a Leap Year");
   }
   else{
    System.out.println(year+" is not a leap Year ");
   }
   
  }
}
