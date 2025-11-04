import java.util.ArrayList;

public class findAllpos {

  // tail recursion 
  public static ArrayList<Integer> findpos(int[]arr,int target,int i, ArrayList<Integer> list)
  {
    if(i==arr.length){
      return list;
    }

    if(arr[i]==target)
    {
      list.add(i);
    }
   
      return findpos(arr, target, i+1, list); 
  }

  // accumulator recursion 
  public static ArrayList<Integer> findPos(int[]arr,int k, int i)
  {
    if(i==arr.length) return new ArrayList<>();

    ArrayList<Integer> ans = findPos(arr, k, i+1);

    if(arr[i]==k) ans.add(0,i);

    return ans;
  }
  public static void main(String[] args) {
    
    int [] arr = {1,2,3,4,5,3,2,1};
    int target=3;

    // System.out.println(findpos(arr,target,0,new ArrayList<>()));
    System.out.println(findPos(arr,target,0));
  }
}
