public class LinearSearch {

  public static int recLinearSearch(int[]arr,int target,int i)
  {
    if(i==arr.length) return -1;

    return arr[i]==target?i: recLinearSearch(arr, target, i+1);
  }
  public static void main(String[] args) {
    
    int[] arr={1,2,3,4,5,6,7};
    int target=5;

   System.out.println( recLinearSearch(arr,target,0));
  }
}
