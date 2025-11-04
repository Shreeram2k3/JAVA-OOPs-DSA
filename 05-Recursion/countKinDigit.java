public class countKinDigit {
  
  //accumulator method
  public static int count(int n, int k,int count)
  {
    if(n<=0)return count;

    return count(n/10,k,n%10==k? count+1:count);
  }

  // classic recursion without accumulator

  public static int count(int n, int k)
  {
    if(n==0)return 0;

    return (n%10==k?1:0)+ count(n/10, k);
  }
  public static void main(String[] args) {
    
    int k =2;

    System.out.println(count(21232,k,0));
    System.out.println(count(21232,k));
  }
}
