/* A researcher has collected the height of men and womwn and stored it seperately. Now it is required to have all the heights
in one list. Write a  prg to read two 1d arrays and merge them into another 1d array */

import java.util.Scanner;

public class Arrprg04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the no.of men:");
        int m = inp.nextInt();
        System.out.print("Enter the no.of women:");
        int w = inp.nextInt();

        int [] men = new int[m];
        int[] women = new int[w];
        int [] heights = new int[m+w];

        for (int i = 0; i < m; i++) {
            men[i] = inp.nextInt();
        }

        for (int i = 0; i < w; i++) {
            women[i] = inp.nextInt();
        }
        inp.close();

        for (int i = 0; i < m; i++) {
           heights[i] = men[i];
        }

        for (int i = m; i < m+w; i++) {
            heights[i] = women[i];
        }

        System.out.println("The Height List is:");
        for (int i = 0; i < w+m; i++) {
            System.out.print(heights[i]+" ");
        }
        
    }
}
