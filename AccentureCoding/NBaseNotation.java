package AccentureCoding;

import java.util.HashMap;
import java.util.Map;

public class NBaseNotation {
    public static void main(String[] args) {
        System.out.println(dectoNBase(21, 5678));
    }
    static String dectoNBase(int n,int num){
        String result="";
        String result2="";
        char[]ch={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int j=0;
        Map<Integer,String>mp=new HashMap<>();
        for(int i=0;i<36;i++){
            if(i<10){
            mp.put(i, i+"");
            }
            else{
                mp.put(i, ch[j]+"");
                j++;
            }
        }
        // System.out.println(mp);
        while (num>0) {
            int rem=num%n;
            num=num/n;
            result+=mp.get(rem);
        }
        for(int i=result.length()-1;i>=0;i--){
            result2+=result.charAt(i);
        }
        return result2;
    }
}
