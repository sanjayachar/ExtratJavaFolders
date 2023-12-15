import java.util.Arrays;

public class ReverseImage {
    public static void main(String[] args) {
        int[]nums={-4,-1,0,3,10};
        int[]nums2=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        int index=nums.length-1;
        int next=start+1;
        while(start<end&&next<end){
            if(Math.abs(nums[start])>Math.abs(nums[end])){
                nums2[index]=nums[start]*nums[start];
                start++;
            }
            else{
                nums2[index]=nums[end]*nums[end];
                end--;
            }
            index--;
        }
        System.out.println(Arrays.toString(nums2));        
    }
}
