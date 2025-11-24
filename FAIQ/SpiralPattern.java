package FAIQ;

public class SpiralPattern {
  
  public static void main(String[] args) {
     long startTime = System.nanoTime();

        // Simulate some work
        for (int i = 0; i < 1000000; i++) {
            // Do nothing, just a loop to consume time
        }

        int n = 5; 
        int size = 2 * n - 1; 
        int[][] matrix = new int[size][size];

        int top = 0, bottom = size - 1;
        int left = 0, right = size - 1;
        int value = n;

        while (top <= bottom && left <= right) {
            
            for (int j = left; j <= right; j++) {
                matrix[top][j] = value;
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value;
            }
            right--;

            
            for (int j = right; j >= left; j--) {
                matrix[bottom][j] = value;
            }
            bottom--;

           
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value;
            }
            left++;

            
            value--;
        }

        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

         long endTime = System.nanoTime();

        long durationInNano = endTime - startTime;
        long durationInMillis = durationInNano / 1_000_000;
        double durationInSeconds = (double) durationInNano / 1_000_000_000.0;

        System.out.println("Execution time in nanoseconds: " + durationInNano);
        System.out.println("Execution time in milliseconds: " + durationInMillis);
        System.out.println("Execution time in seconds: " + durationInSeconds);


    }

}
