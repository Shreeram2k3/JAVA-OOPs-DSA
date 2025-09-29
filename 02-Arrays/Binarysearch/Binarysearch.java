package Binarysearch;
public class Binarysearch {
  

  public static int bisearch(int[]arr,int target)
  {
    int start = 0, end = arr.length-1;

    while(start<=end)
    {
      int mid = start+(end-start)/2;

        boolean isAsc = arr[0]<arr[arr.length-1];

        if(target==arr[mid]) return mid;

        if(isAsc)
        {
          if(target<arr[mid])
          {
            end = mid-1;
          }
          else if(target>arr[mid])
          {
            start = mid+1;
          }
        }
        else
        {
          if(target>arr[mid])
          {
            end = mid-1;
          }
          else if(target<arr[mid])
          {
            start = mid+1;
          }
        }
    }
    return -1;
  }
  public static void main(String[] args) {
    
    // int [] arr = {1,2,4,6,8,9,10,23};

    int [] arr = {23,20,13,11,8,7,6,4,3};
    
    System.out.println(bisearch(arr,223));
  }
}
