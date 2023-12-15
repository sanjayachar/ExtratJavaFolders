package TCSNQT;

import java.util.Arrays;

public class SmallestNum {
    public static void main(String[] args) {
        int[]arr={1,2,3,45,36,7,54,35,86,32,34,65,3,21};
        
        int fMax=0;
        int sMax=0;
        int fMin=Integer.MAX_VALUE;
        int sMin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(fMax<arr[i]){
                sMax=fMax;
                fMax=arr[i];
            }else if(sMax<arr[i]&&arr[i]!=fMax)
                sMax=arr[i];
            if(fMin>arr[i]){
                sMin=fMin;
                fMin=arr[i];
            }else if(sMin>arr[i]&&arr[i]!=fMin)
                sMin=arr[i];
        }
        System.out.println("First min val: "+fMin+"\nFirst max val: "+fMax);
        System.out.println("Second min val: "+sMin+"\nSecond max val: "+sMax);

    }
}
