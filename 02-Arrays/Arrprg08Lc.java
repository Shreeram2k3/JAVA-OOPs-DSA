/* leetcode prblm no:1480
https://leetcode.com/problems/running-sum-of-1d-array/
 */

import java.util.Arrays;

public class Arrprg08Lc {
    public static int[] runningSum(int[] nums) {
        int [] rsum = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                rsum[i]=nums[i];
            }
            if(i>0){
            rsum[i] = nums[i]+rsum[i-1];
            }
        } 
        return rsum;
    }    
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
