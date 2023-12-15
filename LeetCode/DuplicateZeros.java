import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[]arr={1,0,2,3,0,4,5,0};
        List<Integer>arr2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){//arr[1]==0 f,arr[2]==2 f,arr[3]==3 f,arr[4]==0 t
                arr2.add(0);//i=0 [0],i=4 [0,0,2,3,0,0]
            }
            if(i+1>=arr.length){
                break;
            }
            arr2.add(arr[i+1]);//i+1=1 [0,0],i(1)+1=2 [0,0,2],i(2)+1=3 [0,0,2,3],i(3)+1=4 [0,0,2,3,0]
            //i(4)+1=5 [0,0,2,3,0,0,4],i(5)+1=6 [0,0,2,3,0,0,4,5]
        }
        arr2.add(0, arr[0]);
        for(int i=0;i<arr.length;i++){
            arr[i]=arr2.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
