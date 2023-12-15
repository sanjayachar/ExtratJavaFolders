import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ContainerWater {
    public static void main(String[] args) {
        int[]nums={1,8,6,2,5,4,8,3,7};

        int i=0;
        int j=nums.length-1;
        ArrayList<Integer> hold=new ArrayList<>();
        while(i<j){
            hold.add(Math.min(nums[i],nums[j])*(j-i));
            if(nums[i]<nums[j]){
                i++;
            }
            else{
                j--;
            }
        }
        Collections.sort(hold);
        System.out.println(hold.get(hold.size()-1));
    }
}
