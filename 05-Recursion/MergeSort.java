import java.util.Arrays;

public class MergeSort {

  public static int[] mergeSort(int []arr)
  {
    if(arr.length==1) return arr;

    int mid= arr.length/2;

    // Arrays.copyOfRange(original arr, start index, desiredlastindex+1) the 3rd parameter lastindex considers given idx-1; 
    int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
    int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

    return merge(left,right);

  }

  public static int[] merge(int[]left, int [] right)
  {
    int i=0,j=0,k=0;
    int [] mergearr = new int[left.length+right.length];

    while(i<left.length && j<right.length)
    {
      if(left[i]<right[j])
      {
        mergearr[k++]=left[i++];
        
      }
      else{
        mergearr[k++]=right[j++];
      }
    }

    while(i<left.length)
    {
       mergearr[k++]=left[i++];
    }

    while(j<right.length)
    {
       mergearr[k++]=right[j++];
    }

    return mergearr;
  }

  public static void main(String[] args) {
    int [] arr = {5,7,1,9,2,4,8};

    arr= mergeSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
