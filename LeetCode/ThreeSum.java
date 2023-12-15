import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[]nums={-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        int i=0;
        int target=0;
        List<List<Integer>>sum=new ArrayList<>();
        while(i<nums.length){
            target=-nums[i];
            int j=i+1;
            int k=nums.length-1;
            if(i==0||nums[i]!=nums[i-1]||nums[j]!=nums[j-1]||nums[k]!=nums[k+1])
            while(j<k){
                if(nums[j]+nums[k]==target){
                    sum.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(i<nums.length-1&&nums[i]==nums[i+1])
                        i++;
                    while(k>0&&nums[k]==nums[k-1])
                        k--;
                    j++;
                    k--;
                }

                else if(nums[j]+nums[k]<target){
                    j++;
                }
                else{
                    k--;
                }
            }
            i++;
        }
        System.out.println(sum);
    }
}
