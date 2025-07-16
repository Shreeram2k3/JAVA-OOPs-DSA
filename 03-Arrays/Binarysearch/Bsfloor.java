package Binarysearch;
/* Find the Floor of a number

Floor: Biggestest number smaller than or equal to target number 

when the while loop breaks return end
*/


public class Bsfloor {

    public static int findfloor(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;

            if(target<arr[mid])
            {
                end = mid -1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }

            else{
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int floor = findfloor(arr,10);
        System.out.println("Floor pos:"+floor);
        if(floor>0)
        System.out.println("Floor Element:"+arr[floor]);
        
    }
}
