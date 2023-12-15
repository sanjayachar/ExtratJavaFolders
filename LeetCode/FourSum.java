import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[]nums={1,0,-1,0,-2,2};
        int target=0;
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        // Collections.sort((List<Integer>) list);
        for(int i=0;i<nums.length;i++){
            if(i==0||nums[i]!=nums[i-1]){
                for(int j=i+1;j<nums.length;j++){
                    if(j==i+1||nums[j]!=nums[j-1]){
                        int k=j+1;
                        int l=nums.length-1;
                        while(k<l){
                            if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                                list.add((ArrayList<Integer>) Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                                k++;
                                l--;
                                while(k<l&&nums[k]==nums[k-1])
                                    k++;
                                while(k<l&&nums[l]==nums[l+1])
                                    l--;
                            }
                            else if(nums[i]+nums[j]+nums[k]+nums[l]<target){
                                k++;
                            }else{
                                l--;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(list);
    }
}
