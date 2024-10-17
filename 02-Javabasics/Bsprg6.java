// 6.)Program to Input currency in rupees and output in USD. (Currency converter)

import java.util.Scanner;

public class Bsprg6 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the amount in Rupees:");
    float rs= inp.nextFloat();
    inp.close();

    double usd = rs*0.012;

    System.out.printf("%.2f  rupees equals %.2f USD",rs,usd);
  }
  
}
