package MountBlueContast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SalesByMatch {
    public static void main(String[] args) {
        List<Integer>arr=Arrays.asList(1,2,1,3,1,3,2);
        int i=0,j=i+1,count=0;
        Collections.sort(arr);//1,1,1,2,2,2,3
        List<Integer>aList=new ArrayList<>();
        while(i<arr.size()){//i=0 t,
            int target=arr.get(i);
            while (j<arr.size()) {
                if(!arr.get(j).equals(target)){
                    break;
                }
                    count++;
                    j++;
            }
            aList.add(count);
            i++;
        }
        System.out.println((int)Math.ceil(count/2.0));
        System.out.println(aList);
    }
}
