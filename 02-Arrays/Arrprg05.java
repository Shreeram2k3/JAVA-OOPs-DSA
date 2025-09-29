/* We have the information about the monthly income(in INR) of different groups of people. we required to find the poverty line. 
Median shall be used to find the poverty line, which can more accurately decide the people below the benchmark are poverty-ridden.
write a program to sort the datas and find the median income */

import java.util.Scanner;

public class Arrprg05 {
    public static void main(String[]args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] income = new int[n];
        int temp;

        for (int i = 0; i < n; i++) {
            income[i] = inp.nextInt();
        }
        inp.close();

        for (int i = 0; i < n; i++) {
           
            if (i<n-1){

                if(income[i]<income[i+1])
                    continue;
                else
                    temp = income[i];
                    income[i] = income[i+1];
                    income[i+1] = temp;
                    
            }
        }

        for (int i : income) {
            System.out.print(i+" ");
            
        }
    }
}

// to be completed soon