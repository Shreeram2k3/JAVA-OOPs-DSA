// 5.)Program to Take 2 numbers as input and print the largest number.(Greatest of 2 numbers)

import java.util.Scanner;

public class Bsprg5 {
 public static void main(String[] args) {
  Scanner inp = new Scanner(System.in);

  System.out.print("Enter number 1:");
  int a = inp.nextInt();
  System.out.print("Enter number 2:");
  int b = inp.nextInt();
  inp.close();

  if(a>b)
  {
    System.out.printf("Number %d is the Largest",a);
  }

  else{
    System.out.printf("Number %d is the Largest",b);
  
  }
 } 
}
