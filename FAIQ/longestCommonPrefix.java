package FAIQ;

public class longestCommonPrefix {


  public static String lcp(String[] strs) {
        if (strs == null || strs.length == 0) return "";

       
        String prefix = strs[0];

      
        for (int i = 1; i < strs.length; i++) {
            
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

  public static void main(String[] args) {
     long startTime = System.nanoTime();

        // Simulate some work
        for (int i = 0; i < 1000000; i++) {
            // Do nothing, just a loop to consume time
        }

        String[] words1 = {"flowers", "flow", "fly", "flight"};
        String[] words2 = {"dog", "cat", "animal", "monkey"};
        String[] words3 = {"lady", "lazy"};

        System.out.println(lcp(words1)); // Output: "fl"
        System.out.println(lcp(words2)); // Output: ""
        System.out.println(lcp(words3)); // Output: "la"

         long endTime = System.nanoTime();

        long durationInNano = endTime - startTime;
        long durationInMillis = durationInNano / 1_000_000;
        double durationInSeconds = (double) durationInNano / 1_000_000_000.0;

        System.out.println("Execution time in nanoseconds: " + durationInNano);
        System.out.println("Execution time in milliseconds: " + durationInMillis);
        System.out.println("Execution time in seconds: " + durationInSeconds);

    }

    
  
}
