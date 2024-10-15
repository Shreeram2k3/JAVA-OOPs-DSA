// 2.)Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Bsprg2 {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter a Name:");
    String name = inp.next();
    inp.close();
    System.out.println("Hello!,"+name);
  }
}