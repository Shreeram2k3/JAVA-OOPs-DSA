// program to seperate odd and even integers from the given Array into seperate ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class Arrprg02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = inp.nextInt();
        int [] arr = new int[n];
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        
        System.out.println("Enter the elements of Array:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        inp.close();
        
        for (int i = 0; i < n; i++) {
            if (arr[i]%2!=0)
            {
                odd.add(arr[i]);
            }
            else
            {
                even.add(arr[i]);
            }
        }
        System.out.print("Odd elements in the Array:" );
        System.out.println(odd);
        System.out.print("Even elements in the Array:" );
        System.out.println(even);
    }
}
