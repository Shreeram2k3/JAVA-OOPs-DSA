package Searching;
/* lc prblm 34
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */
import java.util.Arrays;

public class Lc34 {

    public static int[] fnloccurances(int[]arr,int target)
    {
        int [] ans = {-1,-1};

        ans[0]= search(arr,target,true);
        ans[1] = search(arr, target, false);
        return ans;
        
    }

    public static int search(int[]arr,int target,boolean isstartindex)
    {
        int ans = -1;

        int start=0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if (target>arr[mid])
            {
                start = mid+1;
            }
            else
            {
                ans = mid;
                if(isstartindex)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] arr ={5,7,7,8,8,10};
        System.out.println(Arrays.toString(fnloccurances(arr,7)));
    }
}
