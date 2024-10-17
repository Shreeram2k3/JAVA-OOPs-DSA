// 1.)Program to print whether a number is even or odd, take input from the user

import java.util.*;
public class Bsprg01 {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:");
        n=inp.nextInt();
        inp.close();
        if (n%2==0)
        {
            System.out.printf("%d is an EVEN number",n);
        }
        else {
            System.out.printf("%d is an ODD number",n);
        }

    }
}