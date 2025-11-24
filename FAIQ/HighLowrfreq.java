package FAIQ;
public class HighLowrfreq {
  public static void main(String[] args) {
     long startTime = System.nanoTime();

        // Simulate some work
        for (int i = 0; i < 1000000; i++) {
            // Do nothing, just a loop to consume time
        }


    int [] arr ={4, 4, 5, 5, 6};

    int max=arr[0];
    for(int i: arr) if(i>max) max=i;
    int [] freq = new int[max+1];
    
    for(int i : arr) freq[i]++;

    int high=Integer.MIN_VALUE, low = Integer.MAX_VALUE;

    for(int i: arr)
    {
      if(freq[i]>high) high = freq[i];
      else if (freq[i]<low) low =freq[i];
    }
    System.out.println(high+low);

     long endTime = System.nanoTime();

        long durationInNano = endTime - startTime;
        long durationInMillis = durationInNano / 1_000_000;
        double durationInSeconds = (double) durationInNano / 1_000_000_000.0;

        System.out.println("Execution time in nanoseconds: " + durationInNano);
        System.out.println("Execution time in milliseconds: " + durationInMillis);
        System.out.println("Execution time in seconds: " + durationInSeconds);

    

  }
}
