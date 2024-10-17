/* 4.)Program to Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions) 
   Simple calculator
 */

import java.util.Scanner;

public class Bsprg04 {
  public static void main(String[] args) {
   Scanner inp = new Scanner(System.in);
   
   System.out.print("Enter number 1:");
   int a = inp.nextInt();
   System.out.print("Enter number 2:");
   int b = inp.nextInt();
   System.out.print("Enter an operator:");
   char operator = inp.next().charAt(0);
   inp.close();

   if(operator == '+')
   {
    System.out.printf("Sum of %d + %d is %d",a,b,a+b);
   }

   else if(operator == '-')
   {
    System.out.printf("Diff of %d - %d is %d",a,b,a-b);
   }

   else if(operator == '*')
   {
    System.out.printf("Product of %d * %d is %d",a,b,a*b);
   }

   else if(operator == '/')
   {
    System.out.printf("Quotient of %d / %d is %d",a,b,a/b);
   }

   else 
   System.out.println("Enter a valid Operator");
  }
}
