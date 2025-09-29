// program to find the pivot in rotated sorted Array


package Binarysearch;

public class FindpivotRSA {

  public static int findpivot(int[] arr)
  {
    int start =0;
    int end = arr.length-1;

      while(start<=end)
      {
        int mid = start +(end-start)/2;

          if(mid<end && arr[mid]>arr[mid+1])
          {
            return mid;
          }
          else if(mid>start && arr[mid]<arr[mid-1])
          {
            return mid-1;
          }
          else if(arr[mid]<= arr[start])
          {
            end = mid-1;
          }
          else
          {
            start = mid+1;
          }
      }
      return-1;
  }
  public static void main(String[] args) {
    int [] arr = {5,6,7,1,2,3,4};

    System.out.println("Pivot: "+findpivot(arr));

  }
}
