/* Example program for Order agnostic Binarysearch this can be used 
if we dont know if the arr is sorted in ascending or decending order  
 */
public class OABinarysearch {

    public static int bsearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        boolean isasending= arr[start]<arr[end];

        while(start<=end)
        {
            int mid = start+ (end-start)/2;

            if(target==arr[mid])
            {
                return mid;
            }
            if(isasending){
                if(target<arr[mid])
                {
                    end = mid-1;
                }
                else if (target>arr[mid])
                {
                    start =mid+1;
                }
            }
            else{
                if(target>arr[mid])
            {
                end = mid-1;
            }
            else if (target<arr[mid])
            {
                start =mid+1;
            }
            }
            
            
        }
        return -1;
    }
    public static void main(String[] args) {
        // int [] arr = {2,4,6,7,8,9,12,15,26,35,96,106,256};
        int[] arr = {106,96,86,74,63,52,47,39,25,12,7};
        int target = 74;
        int pos = bsearch(arr,target);
        System.out.println("The element "+target+" is found at pos "+pos); 
    }
}

