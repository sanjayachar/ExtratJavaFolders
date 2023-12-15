package TCSNQT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequencyEle {
    public static void main(String[] args) {
        int[]arr={10,5,10,15,10,5};
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i]))
                mp.put(arr[i], mp.get(arr[i])+1);
            else
                mp.put(arr[i],1);
        }
        // System.out.println(st);
        System.out.println(mp);
    }
}
