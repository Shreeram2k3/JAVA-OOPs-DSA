// Program to find the sum of all the elements of the array

import java.util.Scanner;

public class Arrprg01
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int sum = 0;
        int [] arr  = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
            
        }
        System.out.print("The elements in the array are: ");
       

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            sum+=arr[i];
            
        }
        System.out.println("\nThe sum of the elements in array is: "+sum);
        inp.close();
    }
}