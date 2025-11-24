package FAIQ;

public class Palindrome {

  public static boolean isPalindrome(String str, int i)
  {
    
    int n = str.length();
    if(i==n/2) return true;

    if(str.charAt(i)!=str.charAt(n-i-1)) return false;

    return isPalindrome(str, i+1);

  }

  public static void main(String[] args) {

     long startTime = System.nanoTime();

        // Simulate some work
        for (int i = 0; i < 1000000; i++) {
            // Do nothing, just a loop to consume time
        }


    String str = "hannah";
    String str2 =  "aabbaaa";
    String str3 =  "aabbcccdbbaa";

   System.out.println(str+" "+isPalindrome(str,0));
   System.out.println(str2+" "+isPalindrome(str2,0));
   System.out.println(str3+" "+isPalindrome(str3,0));

    long endTime = System.nanoTime();

        long durationInNano = endTime - startTime;
        long durationInMillis = durationInNano / 1_000_000;
        double durationInSeconds = (double) durationInNano / 1_000_000_000.0;

        System.out.println("Execution time in nanoseconds: " + durationInNano);
        System.out.println("Execution time in milliseconds: " + durationInMillis);
        System.out.println("Execution time in seconds: " + durationInSeconds);


  }
}
