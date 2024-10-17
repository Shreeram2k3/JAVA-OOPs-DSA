// To find out whether the given String is Palindrome or not.

import java.util.*;

public class Bsprg10 {
public static void main(String[] args) {
  Scanner inp = new Scanner(System.in);
  System.out.print("Enter a String:");
  String word = inp.next();
  inp.close();

  int len = word.length();
  boolean isPalindrome = true;

  for(int i=0;i<len/2;i++)
  {
    // checking the 1st letter and the corresponding letter from last upto midddle 
    if(word.charAt(i)!= word.charAt(len-i-1))
    {
      isPalindrome = false;
      break;
    }
  }

  if (isPalindrome)
  {
    System.out.printf("%s is a Palindrome",word);
  }
  else{
    System.out.printf("%s is not a Palindrome",word);
  }
}
}
