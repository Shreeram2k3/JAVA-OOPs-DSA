// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Bsprg12 {
  public static void main(String[] args) {
    System.out.print("Enter a String:");
   Scanner inp = new Scanner(System.in);
   String word = inp.nextLine();
   inp.close();
   String rword="";
    // iterating String in reverse
   for(int i = word.length()-1;i>=0;i--)
   {
     // charAt(i) picks the character from String at the ith index 
      rword+=word.charAt(i);
   }


  /* (word == rword )compares the references of the variable instead of values. 
  so always use .equals() method to compare a String
 */
   if (word.equals(rword))
   {
    System.out.println("Palindrome");
   }
   else{
    System.out.println("Not a Palindrome");
   }
  }

}

