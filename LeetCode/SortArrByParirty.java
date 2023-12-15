import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrByParirty {
    public static void main(String[] args) {
        int[]arr={4,2,5,7};
        /*
         * i=1,odd=6,nums[1]=nums[6]=45,nums[6]=nums[1]=2
         * i=3,odd=7,nums[3]=nums[7]=7,nums[7]=nums[3]=8
         * i=5,odd=8,nums[5]=nums[8]=3,nums[8]=nums[5]=2
         * i=7,odd=9,nums[7]=nums[9]=5,nums[9]=nums[7]=8
         * i=9,odd=10,nums[9]=nums[10]=7,nums[10]=nums[9]=8
         * i=11,odd=11,nums[11]=mums[11]=9,nums[11]=nums[11]=9
         * nums={4,45,6,7,0,3,2,5,2,7,8,9}
         */
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
       static public int[] sortArrayByParity(int[] nums) {
        int even=0;
        int odd=1;
        int[]nums2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums2[even]=nums[i];
                even+=2;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                nums2[odd]=nums[i];
                odd+=2;
            }
        }
        return nums2;
    }
}
