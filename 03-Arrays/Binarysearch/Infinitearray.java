package Binarysearch;
// Given a sorted array arr[] of infinite numbers. The task is to search for an element k in the array.
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

// Examples:

// Input: arr[] = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170], k = 10
// Output: 4
// Explanation: 10 is at index 4 in array.


// Input: arr[] = [2, 5, 7, 9], k = 3
// Output: -1
// Explanation: 3 is not present in array.

public class Infinitearray
{

  public static int bs(int[]arr,int target,int start,int end)
  {
    while(start<=end)
    {
      int mid =  start+(end-start)/2;
        
      if (target<arr[mid]) 
      {
        end  = mid-1;
      }
      else if (target> arr[mid])
      {
        start = mid+1;
      }
      else
      {
        return mid;
      }
    }
    return -1;
  }

  public static int searchspace(int[] arr, int target)
  {
      int start = 0;
      int end = 1;

      while(arr[end]<target)
      {
        int temp = start;
        start = end+1;
        end = end+(end-temp)*2;
      }
      return bs(arr,target,start,end);
  }
  public static void main(String[] args) {
    int [] arr ={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
    int target = 100;
    System.out.println(searchspace(arr,target));
  }
}
