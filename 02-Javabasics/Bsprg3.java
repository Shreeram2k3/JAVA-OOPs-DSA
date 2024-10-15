// 3.)Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Bsprg3 {
  
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    
    System.out.print("Enter the principal Amount:");
    int P = inp.nextInt();
    System.out.print("Enter the Time:");
    int T = inp.nextInt();
    System.out.print("Enter the Rate:");
    int R = inp.nextInt();
    inp.close();

    int SI = (P*R*T)/100;

    System.out.println("The simple Interest earned will be:"+SI);

  }
}
