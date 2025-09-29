/* when the city planners devoloped your neighborhood , they accidentally numbered the houses wrong. as such the addresses
of the houses on the street are in Random order.
Write a program using Linear search Algorithm to help the postman find a house. 

Test case 

Door Numbers [100,205,345,789,450,123]
Door number to find: 789

output
Door number 789 found at index 3
 */

import java.util.Scanner;

public class Arrprg03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of Doornumbers:");
        int n = inp.nextInt();
        int [] Doornum = new int[n];

        for (int i = 0; i < Doornum.length; i++) {
            Doornum[i] = inp.nextInt();
        }
        System.out.print("Door number postman Wants to Find:");
        int dnf= inp.nextInt();
        inp.close();

        for (int i = 0; i < Doornum.length; i++) {
            if(Doornum[i]==dnf)
            {
                System.out.printf("Door number %d found at index %d",dnf,i);
            }
        }
        
    }
}
