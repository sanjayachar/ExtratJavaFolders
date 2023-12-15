package TCSNQT;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReverseArr implements Serializable,Comparable{
    public static void main(String[] args) {
        // int[]arr={5,4,3,2,1};
        // System.out.println(reverseBabe(arr));
        Thread a=new Thread();
        System.out.println(a.isDaemon());
    }
    // static List<Integer> reverseBabe(int[]arr){
    //     List<Integer>arrL=new ArrayList<>();
    //     for(int i=arr.length-1;i>=0;i--){
    //         arrL.add(arr[i]);
    //     }
    //     return arrL;
    // }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
