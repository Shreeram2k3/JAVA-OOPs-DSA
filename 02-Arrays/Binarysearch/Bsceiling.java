package Binarysearch;
/* Find the ceiling of a number

ceiling: Smallest number greater than or equal to target number 

when the while loop breaks return start

prblm no:35 
https://leetcode.com/problems/search-insert-position/

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

*/

public class Bsceiling {

    public static int findceiling(int [] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        // what if the target is greater than the greatest number in the array
        if(target >arr[arr.length-1])
        {
            return -1;
        }

        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(target<arr[mid])
            {
                end = mid -1;
            }

            else if ( target > arr[mid])
            {
                start = mid+1;
            }

            else
            {
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int celing = findceiling(arr,10);
        // int ans = bs(arr,11);
        System.out.println("ceiling pos:"+celing);
        if(celing>0){

            System.out.println("Ceiling Element:"+arr[celing]);
        }
    }    
}
