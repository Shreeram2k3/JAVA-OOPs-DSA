public class binarySearch {
  

  public static int bisearch(int[]arr,int target)
  {
    int start = 0, end = arr.length-1;

    while(start<=end)
    {
      int mid = start+(end-start)/2;

        if(arr[mid]<target) end = mid-1;

        else if(arr[mid]>target) start=mid+1;

        else
        {
          return mid;
        }
    }
    return -1;
  }
  public static void main(String[] args) {
    
    int [] arr = {1,2,4,6,8,9,10,23};
    
    System.out.println(bisearch(arr,2));
  }
}
