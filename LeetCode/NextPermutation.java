import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[]arr={2,1,5,4,3,0,0};
        System.out.println("Original permutation: "+Arrays.toString(arr));
        nextPermutation(arr);//{2,3,0,0,1,4,5}
        System.out.println("Next permutation: "+Arrays.toString(arr));
    }
    static void nextPermutation(int [] nums){//{2,1,5,4,3,0,0}
        int i=nums.length-2;//i=nums.length-2=5
        while(i>=0&&nums[i]>=nums[i+1]){//5>=0 t&& nums[5]>=nums[6] t,nums[4]>=nums[5] t,nums[1]>=nums[2] f 
            i--;//i=4,i=3,i=2,i=1
        }
        if(i>=0){//1>=0 t
            int j=nums.length-1;//j=nums.length-1=6
            while(nums[j]<=nums[i]){//nums[6](0)<=nums[1](1)=(0<=1) t,0<=1 t,3<=1 f
                j--;//j=5,j=4
            }
            swap(nums,i,j);//{2,3,5,4,1,0,0},1,4
        }
        reverse(nums,i+1,nums.length-1);//{2,3,5,4,1,0,0},1+1=2,6
    }
    static void reverse(int[]nums,int start,int end){//{2,3,5,4,1,0,0},1+1=2,6
        while(start<end){//2<6 t,3<5 t,4<4 f
            swap(nums,start,end);//{2,3,0,4,1,0,5},{2,3,0,0,1,4,5}
            start++;//start=3,4
            end--;//end=5,4
        }
    }
    static void swap(int[]nums,int i,int j){//{2,1,5,4,3,0,0},1,4|{2,3,5,4,1,0,0},2,6|{2,3,5,4,1,0,0},3,5
        int temp=nums[i];//temp=4
        nums[i]=nums[j];//nums[3]=0
        nums[j]=temp;//nums[5]=4
    }
}
