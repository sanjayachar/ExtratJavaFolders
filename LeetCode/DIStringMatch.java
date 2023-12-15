import java.util.ArrayList;
import java.util.Arrays;

public class DIStringMatch {
    public static void main(String[] args) {
        String s="III";
        Object obj;
        ArrayList<Integer>aList=new ArrayList<>();
        int start=0;
        int end=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                aList.add(start);
                start++;
            }
            else if(s.charAt(i)=='D'){
                aList.add(end);
                end--;
            }
        }
        if(s.charAt(s.length()-1)=='I'){
            aList.add(start);
        }
        else{
            aList.add(end);
        }
        int[]arr=new int[aList.size()];
        for(int i=0;i<aList.size();i++){
            arr[i]=aList.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
