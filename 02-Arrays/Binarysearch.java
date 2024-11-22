// Example program for Binarysearch
public class Binarysearch {

    public static int bsearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start+ (end-start)/2;

            if(target<arr[mid])
            {
                end = mid-1;
            }
            else if (target>arr[mid])
            {
                start =mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,7,8,9,12,15,26,35,96,106,256};
        int target = 256;
        int pos = bsearch(arr,target);
        System.out.println("The element "+target+" is found at pos "+pos); 
    }
}
