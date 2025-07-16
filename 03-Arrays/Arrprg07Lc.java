/* leetcode prblm no:1929
https://leetcode.com/problems/concatenation-of-array/
 */

import java.util.Arrays;

public class Arrprg07Lc {
    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];

        for(int i =0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        for(int i=nums.length;i<arr.length;i++)
        {
            arr[i]=nums[i-nums.length];
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        
    }
}
