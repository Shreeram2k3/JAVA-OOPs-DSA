/* leetcode prbm no 1281
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
 */
import java.util.*;
class Bsprg11Lc {

  public static void main(String[]args)
  {
    Scanner inp = new Scanner(System.in);
    int n = inp.nextInt();
    inp.close();
    int ans = subtractProductAndSum(n);
    System.out.print(ans);
    
  }
    public static int subtractProductAndSum(int n) {
     int pod=1,sod=0;
     while(n>0)
     {
      pod*=(n%10);
      sod+=(n%10);
      n/=10;
      
     }   
      return  pod - sod;
    }
}