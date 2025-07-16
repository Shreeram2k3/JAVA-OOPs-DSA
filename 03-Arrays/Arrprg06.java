/* problem no:1295
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */

import static java.lang.Math.*;

public class Arrprg06 {
    public static void main(String[] args) {

       
        int [] nums = {12,345,2,6,7896,35645,28};

        int ans = findNumbers(nums);
        System.out.println(ans);
        
        
    }

    public static int findNumbers(int[] nums)
    {
        int count =0;

        for (int i = 0; i < nums.length; i++) {
            
            if((int)(log10(nums[i])+1)%2==0)
            {
                count++;
            }
            
        }
        return count;
    }
}
