import java.util.Arrays;
import java.util.List;

public class CountPairs {
    public static void main(String[] args) {
        List<Integer>nums=Arrays.asList(-1,1,2,3,1);
        int target=-2;
        int count=0;
        int i=0;
        while(i<nums.size()){
            int j=i+1;
            while(j<nums.size()){
                if(nums.get(i)+nums.get(j)<target){
                    count++;
                    j++;
                }
            }
            i++;
        }
        System.out.println(count);
    }
}
